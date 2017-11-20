package com.igreen.web.util;

import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.igreen.common.model.Questionnaire;
import com.sun.mail.util.MailSSLSocketFactory;

public class MailSenderUtil {
	
	
	/**
	 * 邮件线程池
	 */
	private static ExecutorService mailExecutor = Executors.newFixedThreadPool(3);
	
	public static void sendMail(Questionnaire q){
		MailRunner mail = new MailRunner(q);
		mailExecutor.submit(mail);
	}
}

class MailRunner implements Runnable{
	private static Logger logger = LoggerFactory.getLogger(MailSenderUtil.class);
	
	Questionnaire q;
	
	MailRunner(Questionnaire q){
		this.q = q;
	}
	
	private void sendMail( ){
		String smtpServer = PropertiesUtil.getValue("mail.host");
		String smtpPort = PropertiesUtil.getValue("mail.port");
        String protocol = PropertiesUtil.getValue("mail.transport.protocol");
        final String username = PropertiesUtil.getValue("mail.username");
        final String  password = PropertiesUtil.getValue("mail.password");
          
        String from = PropertiesUtil.getValue("mail.from");
        String to = PropertiesUtil.getValue("mail.to");
        String subject = PropertiesUtil.getValue("mail.subject");
        String body = PropertiesUtil.getValue("mail.body");
        body = this.buildMailBody(q,body);
          
        Properties props = new Properties();  
        props.setProperty("mail.transport.protocol", protocol);  
        props.setProperty("mail.host", smtpServer);
        props.setProperty("mail.port", smtpPort);
        props.setProperty("mail.smtp.auth", "true");
        MailSSLSocketFactory sf = null;
		try {
			sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
		} catch (GeneralSecurityException e1) {
			e1.printStackTrace();
		}
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.socketFactory", sf);
        
		Session session = Session.getDefaultInstance(props, new MailAuthenricator(username, password));
        MimeMessage msg = new MimeMessage(session);  
        try {  
            msg.setFrom(new InternetAddress(from));
            //收件地址  
            msg.setRecipients(Message.RecipientType.TO, to);
            msg.setSubject(subject);  
            msg.setSentDate(new Date());
            BodyPart bodyPart = new MimeBodyPart();//BodyPart是邮件内容的承载体，可以是文件，图片，附件等...  
            bodyPart.setContent(body, "text/html;charset=UTF-8");//设置页面的编码值  
            Multipart multiPart = new MimeMultipart();//Multipart又是BodyPart的承载体，一个multiPart可以包含多个BodyPart  
            multiPart.addBodyPart(bodyPart);//将bodyPart添加到multiPart  
            msg.setContent(multiPart);//将MultiPart设为邮件内容主体msg的  
            msg.saveChanges();
            Transport.send(msg);//发件人的邮箱地址和密码  
        } catch (Exception e) {  
        	logger.error("发送调查问卷提醒出错",e.getMessage());  
        }  
	}
	
	private String buildMailBody(Questionnaire q,String body){
		body = body.replace("mailCustomerCompany", q.getMailCustomerCompany());
		body = body.replace("mailRaiseAddress", q.getMailRaiseAddress());
		body = body.replace("mailIssuer", q.getMailIssuer());
		body = body.replace("mailBondType", q.getMailBondType());
		body = body.replace("mailIssueBondsAreaAmount", q.getMailIssueBondsAreaAmount());
		body = body.replace("mailIssueBondsArea", q.getMailIssueBondsArea());
		body = body.replace("mailIssueBondsRecords", q.getMailIssueBondsRecords());
		body = body.replace("mailRaiseMainType", q.getMailRaiseMainType());
		body = body.replace("mailRaiseSubType", q.getMailRaiseSubType());
		body = body.replace("mailTechnique", q.getMailTechnique());
		body = body.replace("mailDocuments", q.getMailDocuments());
		body = body.replace("customerName", q.getCustomerName());
		body = body.replace("customerMobile", q.getCustomerMobile());
		body = body.replace("customerMail", q.getCustomerMail());
		body = body.replace("customerWechart", q.getCustomerWechart());
		return body;
	}

	@Override
	public void run() {
		sendMail( );
	}
	
	static class MailAuthenricator extends Authenticator{  
        String u = null;  
        String p = null;  
        public MailAuthenricator(String u,String p){  
            this.u=u;  
            this.p=p;  
        }  
        @Override  
        protected PasswordAuthentication getPasswordAuthentication() {  
            return new PasswordAuthentication(u,p);  
        }
	}
}
