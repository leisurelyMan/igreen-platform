alter table regist_item add column company_id int(11) DEFAULT NULL COMMENT '公司在IPE的companyId';
alter table regist_item add column group_company_public varchar(10) DEFAULT NULL COMMENT '集团公司是否上市';
alter table regist_item add column group_company_name varchar(255) DEFAULT NULL COMMENT '集团公司名称';
alter table regist_item add column group_company_exchange_name varchar(20) DEFAULT NULL COMMENT '集团公司交易所名称';
alter table regist_item add column group_company_stock_code varchar(20) DEFAULT NULL COMMENT '集团公司上市代码';
alter table regist_item add column sewage_facility varchar(20) DEFAULT NULL COMMENT '是否有污水处理设施';
alter table regist_item add column process_gas_facility varchar(20) DEFAULT NULL COMMENT '是否有工业废气处理设施';
alter table regist_item add column boiler_gas_facility varchar(20) DEFAULT NULL COMMENT '是否有锅炉废气处理设施';
alter table regist_item add column industrial_sewage_discharge varchar(100) DEFAULT NULL COMMENT '工业污水去向';
alter table regist_item add column life_sweage_discharge varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '生活污水去向';
alter table regist_item add column industrial_sewage_emission_standard varchar(100) DEFAULT NULL COMMENT '工业污水排放标准';
alter table regist_item add column life_sweage_emission_standard varchar(100) DEFAULT NULL COMMENT '生活污水排放标准';
alter table regist_item add column gas_emission_standard varchar(100) DEFAULT NULL COMMENT '废气执行排放标准';
alter table regist_item add column pollutant_source varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '污染源类型';
alter table regist_item add column main_production varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '生产经营主要产品';
alter table regist_item add column pollutant_desc varchar(200) DEFAULT NULL COMMENT '企业排污情况自述';


drop table if exists hot_words;

/*==============================================================*/
/* Table: hot_words                                             */
/*==============================================================*/
create table hot_words
(
   ID                   int not null auto_increment comment 'ID',
   word                 varchar(255) comment '热词',
   statas               int comment '状态',
   creater              int comment '创建者',
   created_time         date comment '创建时间',
   updater              int comment '更新者',
   updated_time         date comment '更新时间',
   remark               varchar(255) comment '备注',
   primary key (ID)
);

alter table hot_words comment '自定义词库';

drop table if exists hot_stopwords;

/*==============================================================*/
/* Table: hot_stopwords                                         */
/*==============================================================*/
create table hot_stopwords
(
   ID                   int not null auto_increment comment 'ID',
   word                 varchar(255) comment '热词',
   statas               int comment '状态',
   creater              int comment '创建者',
   created_time         date comment '创建时间',
   updater              int comment '更新者',
   updated_time         date comment '更新时间',
   remark               varchar(255) comment '备注',
   primary key (ID)
);

alter table hot_stopwords comment '自定义停用词库';

drop table if exists ipe_elasticsearch;

/*==============================================================*/
/* Table: ipe_elasticsearch                                     */
/*==============================================================*/
create table ipe_elasticsearch
(
   ID                   int not null auto_increment comment 'ID',
   es_id                int comment 'esID即ipe_id',
   statas               int comment '状态',
   creater              varchar(100) comment '创建者',
   created_time         date comment '创建时间',
   updater              varchar(100) comment '更新者',
   updated_time         date comment '更新时间',
   remark               varchar(255) comment '备注',
   primary key (ID)
);

alter table ipe_elasticsearch comment 'IPE写入ES记录';

drop table if exists word_frequency;

/*==============================================================*/
/* Table: word_frequency                                        */
/*==============================================================*/
create table word_frequency
(
   ID                   int not null auto_increment comment 'ID',
   word                 varchar(255) comment '热词',
   times                int comment '出现次数',
   statas               int comment '状态',
   creater              int comment '创建者',
   created_time         date comment '创建时间',
   updater              int comment '更新者',
   updated_time         date comment '更新时间',
   remark               varchar(255) comment '备注',
   primary key (ID)
);

alter table word_frequency comment '词频';

create index Index_province_city on regist_item_location(province,city);

ALTER TABLE `ipe_industry_record`
ADD COLUMN `province`  VARCHAR(50) NULL DEFAULT NULL COMMENT '省';
ADD COLUMN `city`  VARCHAR(50) NULL DEFAULT NULL COMMENT '市';
ADD COLUMN `district`  VARCHAR(50) NULL DEFAULT NULL COMMENT '县';






DROP TABLE IF EXISTS `ly_web_crawler_config`;
CREATE TABLE `ly_web_crawler_config` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
  `web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
  `web_search_url` varchar(500) DEFAULT NULL COMMENT '全文检索首页URL',
  `page_url_regular` varchar(200) DEFAULT NULL COMMENT '分页URL匹配规则',
  `page_type` int(1) DEFAULT NULL COMMENT '已知分页类型（1：总条数；2：总页数）',
  `max_page` int(11) DEFAULT NULL COMMENT '最大分页',
  `page_req_method` int(1) DEFAULT '1' COMMENT '分页请求返回方式（1、AJAX返回html和页面跳转；2、AJAX 返回json）',
  `page_result` varchar(100) DEFAULT NULL COMMENT '分页参数获取正则表达式（多个规则##分割）',
  `detail_url_regular` varchar(500) DEFAULT NULL COMMENT '详情页抓取url规则（多个url规则||分割）',
  `detail_title_regular` varchar(100) DEFAULT NULL COMMENT '抓取标题正则表达式',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '配置时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `start_page` int(11) DEFAULT '0' COMMENT '开始分页',
  `attr_type` varchar(255) DEFAULT NULL COMMENT '获取分页数据正则',
  `attr_name` varchar(255) DEFAULT NULL COMMENT '获取分页数据对应的名称',
  `detail_content_regular` varchar(255) DEFAULT NULL COMMENT '详情页内容获取 xpath',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网站抓取配置表';


DROP TABLE IF EXISTS `web_crawler_result`;
CREATE TABLE `web_crawler_result` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
  `web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
  `web_detail_name` varchar(500) DEFAULT NULL COMMENT '详情标题',
  `web_detail_url` varchar(200) DEFAULT NULL COMMENT '详情页原url',
  `web_detail_result_url` varchar(100) DEFAULT NULL COMMENT '抓取详情页url',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '配置时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网站抓取结果';


INSERT INTO `sys_menu` VALUES (22,'爬虫配置','../crawler/listPage.do',4,12,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `sys_menu` VALUES (23,'爬虫结果','../crawler/resultListPage.do',4,13,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);


ALTER TABLE `web_crawler_result`
ADD COLUMN `save_path`  varchar(100) NULL AFTER `updater`;

INSERT INTO `web_crawler_config` VALUES (4,'浙江省环境保护厅','www.zjepb.gov.cn','http://www.zjepb.gov.cn/jrobot/search.do?webid=2&pg=&p=${page}&tpl=&category=&q=浙江&x=47&y=12','http://www.zjepb.gov.cn/jrobot/search.do?webid=2&pg=&p=${page}&tpl=&category=&q=浙江&x=47&y=12',1,100,1,'div','http://www\\.zjepb\\.gov\\.cn/art/\\d+/\\d+/\\d+/art_\\d+_\\d+.html','//table[@id=\'article\']//td[@class=\'title\']/text()',NULL,'2018-03-25 12:19:55',1,'attr','data-pagecount','//table[@id=\'article\']//td[@class=\'bt_content\']/html()',2,2);



INSERT INTO `sys_menu` VALUES (24,'合规网爬虫','../csrare/resultListPage.do',4,14,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);

DROP TABLE IF EXISTS `web_csrare_result`;
CREATE TABLE `web_csrare_result` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
  `web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
  `web_detail_name` varchar(500) DEFAULT NULL COMMENT '详情标题',
  `web_detail_url` varchar(200) DEFAULT NULL COMMENT '详情页原url',
  `web_detail_result_url` varchar(100) DEFAULT NULL COMMENT '抓取详情页url',
  `attachment_path` varchar(100) DEFAULT NULL COMMENT '附件地址',
  `publish_org` varchar(100) DEFAULT NULL COMMENT '颁布机构',
  `effect_status` varchar(100) DEFAULT NULL COMMENT '生效状态',
  `attach_type` varchar(100) DEFAULT NULL COMMENT '所属类型',
  `application_area` varchar(100) DEFAULT NULL COMMENT '适用地区',
  `application_domain` varchar(100) DEFAULT NULL COMMENT '适用领域',
  `effect_date` DATE DEFAULT NULL COMMENT '生效日期',
  `publish_date` DATE DEFAULT NULL COMMENT '颁布日期',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '配置时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `save_path` varchar(100) DEFAULT NULL COMMENT '保存地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='law网站抓取结果';



DROP TABLE IF EXISTS `web_crawler_config`;
CREATE TABLE `web_crawler_config` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
  `web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
  `web_search_url` varchar(500) DEFAULT NULL COMMENT '全文检索首页URL',
  `page_url_regular` varchar(500) DEFAULT NULL COMMENT '分页URL匹配规则',
  `page_type` int(1) DEFAULT NULL COMMENT '已知分页类型（1：总条数；2：总页数）',
  `max_page` int(11) DEFAULT NULL COMMENT '最大分页',
  `page_req_method` int(1) DEFAULT '1' COMMENT '分页请求返回方式（1、AJAX返回html和页面跳转；2、AJAX 返回json）',
  `page_result` varchar(100) DEFAULT NULL COMMENT '分页参数获取正则表达式（多个规则##分割）',
  `replace_regular` varchar(100) DEFAULT NULL COMMENT '分页数据替换无用字符正则表达式',
  `detail_url_regular` varchar(500) DEFAULT NULL COMMENT '详情页抓取url规则（多个url规则||分割）',
  `detail_title_regular` varchar(500) DEFAULT NULL COMMENT '抓取标题正则表达式',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '配置时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `start_page` int(11) DEFAULT '0' COMMENT '开始分页',
  `attr_type` varchar(255) DEFAULT NULL COMMENT '获取分页数据正则',
  `attr_name` varchar(255) DEFAULT NULL COMMENT '获取分页数据对应的名称',
  `detail_content_regular` varchar(255) DEFAULT NULL COMMENT '详情页内容获取 xpath',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='网站抓取配置表';

#
# Data for table "web_crawler_config"
#
INSERT INTO `web_crawler_config` VALUES (3,'上海环境','ss.sepb.gov.cn','http://ss.sepb.gov.cn/search?q=上海微电机研究所&page=${page}&view=','http://ss.sepb.gov.cn/search?q=上海微电机研究所&page=${page}&view=',2,2,1,'div','','http://www\\.sepb\\.gov\\.cn/fa/cms/shhj/shhj\\d+/shhj\\d+/\\d+/\\d+/\\d+.htm','//div[@id=\'ivs_title\']/tidyText()','2018-04-21 18:55:30','2018-04-21 18:55:30',0,'attr','total','//div[@id=\'ivs_content\']/html()',2,2),(4,'浙江省环境保护厅','www.zjepb.gov.cn','http://www.zjepb.gov.cn/jrobot/search.do?webid=2&pg=&p=${page}&tpl=&category=&q=浙江&x=47&y=12','http://www.zjepb.gov.cn/jrobot/search.do?webid=2&pg=&p=${page}&tpl=&category=&q=浙江&x=47&y=12',2,2,1,'div','','http://www\\.zjepb\\.gov\\.cn/art/\\d+/\\d+/\\d+/art_\\d+_\\d+.html','//table[@id=\'article\']//td[@class=\'title\']/text()','2018-04-21 18:56:28','2018-04-21 18:56:28',1,'attr','data-pagecount','//table[@id=\'article\']//td[@class=\'bt_content\']/html()',2,2),(5,'生态环境部','www.mep.gov.cn','http://websearch.mep.gov.cn/was5/web/search?page=${page}&channelid=233948&searchword=生态环境&keyword=生态环境','http://websearch.mep.gov.cn/was5/web/search?page=${page}&channelid=233948&searchword=生态环境&keyword=生态环境',2,2,1,'a:contains(尾页)','','http://nnsa.mep.gov.cn/\\S+/\\S+/\\d{6}/\\S+_\\d+.htm@http://www.mep.gov.cn/\\S+/\\S+/\\S+/\\d{6}/\\S+_\\d+.htm@http://www.mep.gov.cn/\\S+/\\S+/\\d{6}/\\S+_\\d+.shtml@http://nnsa.mep.gov.cn/\\S+/\\S+/\\S+/\\d{6}/\\S+_\\d+.shtml','//div[@class=\'detail\']//h1/tidyText()#//div[@class=\'wzxq_biaoti2\']//p/tidyText()#//span[@class=\'title\']//b/tidyText()','2018-04-21 18:56:32','2018-04-21 18:56:32',1,'href','page=','//div[@class=\'wz\']/html()#//div[@class=\'TRS_Editor\']/html()#//div[@id=\'ContentRegion\']/html()',2,2),(6,'XX重庆市环境保护局','www.cepb.gov.cn','http://www.cepb.gov.cn/fzlm/znjs/index.shtml?query=重庆市&pageNo=2','http://www.cepb.gov.cn/fzlm/znjs/index.shtml?query=重庆市&pageNo=2',1,10,1,'input[class=\'page-item\'] :last','','http://www.cepb.gov.cn/doc/\\d{4}/\\d{2}/\\d{2}/\\S+.shtml','//div[@class=\'mainCont\']//h1/tidyText()','2018-04-21 18:56:20','2018-04-21 18:56:20',1,'attr','data-pageno','//div[@id=\'Zoom\']/html()',2,2),(7,'安徽省环境保护厅','www.aepb.gov.cn','http://www.aepb.gov.cn/pages/Aepb15_InfoSearch.aspx?Stype=0&SearchKey=安徽&MenuID=&page=${page}','http://www.aepb.gov.cn/pages/Aepb15_InfoSearch.aspx?Stype=0&SearchKey=安徽&MenuID=&page=${page}',2,2,1,'a:contains(尾页)','','http://www.aepb.gov.cn/pages/Aepb15_ShowNews.aspx\\?NType=\\d+\\&NewsID=\\d+','//div[@class=\'stitle\']//h1/tidyText()','2018-04-21 18:56:14','2018-04-21 18:56:14',1,'href','page=','//div[@class=\'scont\']/html()',2,2),(8,'北京市环境保护局','www.bjepb.gov.cn','http://www.bjepb.gov.cn/dig/search.action?ty=&w=false&f=&dr=true&p=${page}&sr=score+desc&rp=szns&advtime=&advrange=&fq=&q=北京市环保局','http://www.bjepb.gov.cn/dig/search.action?ty=&w=false&f=&dr=true&p=${page}&sr=score+desc&rp=szns&advtime=&advrange=&fq=&q=北京市环保局',1,10,1,'div[class=\'cen_top\'] h3','\\S+约|条\\S+','http://www.bjepb.gov.cn/\\S+/\\S+/\\S+/\\d+/index.html@http://www.bjepb.gov.cn/\\S+/\\S+/\\S+/\\S+/\\S+/\\d+/index.html@http://www.bjepb.gov.cn/\\S+/\\S+/\\S+/\\S+/\\d+/index.html','//div[@class=\'h_dl_t\']/tidyText()','2018-04-21 18:56:10','2018-04-21 18:56:10',1,'text','','//div[@id=\'h_dl_c\']/html()',2,2),(9,'绿色和平','www.greenpeace.org.cn','http://www.greenpeace.org.cn/page/${page}/?s=绿色','http://www.greenpeace.org.cn/page/${page}/?s=绿色',2,2,1,'div[class=\'nav-links\'] a:not(.next) @last','','http://www.greenpeace.org.cn/[a-z]+[a-z\\-]+[a-z]/','//div[@class=\'titleGroup\']/h2/tidyText()','2018-04-21 18:56:04','2018-04-21 18:56:04',1,'text','','//div[@class=\'descriptiveParagraph \']/html()',2,2),(10,'甘肃省环保厅','www.gsep.gansu.gov.cn','http://www.gsep.gansu.gov.cn/serach.jsp?a1190t=301&a1190p=${page}&a1190c=10&a1190i=甘肃&wbtreeids=0&Find=find&INTEXT2=55SY6IKD&wbtreeid=1001&news_search_code=&&entrymode=1INTEXT=甘肃','http://www.gsep.gansu.gov.cn/serach.jsp?a1190t=301&a1190p=${page}&a1190c=10&a1190i=甘肃&wbtreeids=0&Find=find&INTEXT2=55SY6IKD&wbtreeid=1001&news_search_code=&&entrymode=1INTEXT=甘肃',1,10,1,'table[class^=headStyle] td:eq(0)','共|条\\S+','http://4g.gsep.gov.cn/info/\\d+/\\d+.htm@http://www.gsep.gansu.gov.cn/info/\\d+/\\d+.htm','//h1[@class=\'news-title\']/tidyText()#//div[@class=\'nrwzbt\']//tidyText()','2018-04-21 18:55:59','2018-04-21 18:55:59',1,'text','','//div[@id=\'vsb_content_2\']/html()#//div[@id=\'vsb_content\']/html()',2,2),(11,'广西环境保护厅','www.gxepb.gov.cn','http://www.gxepb.gov.cn/search/gxepb/qwjs.do?keyword=广西&currentPage=${page}','http://www.gxepb.gov.cn/search/gxepb/qwjs.do?keyword=广西&currentPage=${page}',2,2,1,'a:contains(尾页)','','http://www.gxepb.gov.cn/\\D+/\\D+/\\D+/\\D+/\\d{6}/t\\d+_\\d+.html@http://www.gxepb.gov.cn/\\D+/\\D+/\\D+/\\d{6}/t\\d+_\\d+.html@http://www.gxepb.gov.cn/\\D+/\\D+/\\d+/t\\d+_\\d+.html','//div[@class=\'article\']/h1/tidyText()','2018-04-21 18:55:50','2018-04-21 18:55:50',1,'href','currentPage=','//div[@class=\'article-inner\']/html()',2,2),(12,'贵州省环境保护厅','www.gzhjbh.gov.cn','http://www.gzhjbh.gov.cn/search/home/Index.html?query=贵州&page=${page}','http://www.gzhjbh.gov.cn/search/home/Index.html?query=贵州&page=${page}',1,20,1,'div[class=\'result-status\'] span[class=\'count\']','','http://www.gzhjbh.gov.cn/\\D+/\\D+/\\d+.shtml@http://www.gzhjbh.gov.cn/\\D+/\\D+/\\D+/\\d+.shtml','//div[@class=\'bt\']/tidyText()','2018-04-21 18:56:23','2018-04-21 18:56:23',1,'text','','//div[@id=\'Zoom\']/html()',2,2),(13,'海南省生态环境保护厅','www.hnsthb.gov.cn','http://www.hnsthb.gov.cn/gj_search.jsp?wbtreeid=1001&currentnum=${page}&_vt=5rW35Y2X','http://www.hnsthb.gov.cn/gj_search.jsp?wbtreeid=1001&currentnum=${page}&_vt=5rW35Y2X',2,2,1,'a:contains(尾页)','','http://www.hnsthb.gov.cn/info/\\d+/\\d+.htm','//form[@name=\'_newscontent_fromname\']/div/h1/tidyText()','2018-04-21 18:55:44','2018-04-21 18:55:44',1,'href','currentnum=','//div[@id=\'vsb_content\']/html()',2,2),(14,'河北省环境保护厅','www.hebhb.gov.cn','http://www.hebhb.gov.cn/was5/web/search?page=${page}&channelid=290895&searchword= doctitle=\'河北\' or doccontent=\'河北\'&keyword= doctitle=\'河北\' or doccontent=\'河北\'&perpage=10&outlinepage=10&searchscope=&timescope=&timescopecolumn=&orderby=-docreltime&andsen=&total=&orsen=&exclude=','http://www.hebhb.gov.cn/was5/web/search?page=${page}&channelid=290895&searchword= doctitle=\'河北\' or doccontent=\'河北\'&keyword= doctitle=\'河北\' or doccontent=\'河北\'&perpage=10&outlinepage=10&searchscope=&timescope=&timescopecolumn=&orderby=-docreltime&andsen=&total=&orsen=&exclude=',2,2,1,'a:contains(尾页)','','http://www.hebhb.gov.cn/\\D+/\\D+/\\d{6}/t\\d+_\\d+.html@http://www.hebhb.gov.cn/\\D+/\\D+/\\D+/\\d{6}/t\\d+_\\d+.html','//div[@class=\'consanji\']/h2/tidyText()','2018-04-21 18:56:36','2018-04-21 18:56:36',1,'href','page=','//div[@class=\'congczt\']/html()',2,2);
