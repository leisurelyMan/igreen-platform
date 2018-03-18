# Host: 127.0.0.1  (Version 5.7.17-log)
# Date: 2018-03-17 16:36:27
# Generator: MySQL-Front 5.4  (Build 4.153) - http://www.mysqlfront.de/

/*!40101 SET NAMES utf8 */;

#
# Structure for table "ly_web_crawler_config"
#

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
