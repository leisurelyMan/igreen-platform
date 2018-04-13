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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='law网站抓取结果';
