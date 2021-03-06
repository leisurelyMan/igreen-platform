DROP TABLE IF EXISTS `crawler_ipe_industry_record`;
CREATE TABLE `crawler_ipe_industry_record` (
`id` int(10) NOT NULL AUTO_INCREMENT,
`web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
`web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
`year` varchar(10) DEFAULT NULL COMMENT '年度',
`web_detail_name` varchar(500) DEFAULT NULL COMMENT '详情标题 对应title',
`web_detail_url` varchar(500) DEFAULT NULL COMMENT '详情页原url',
`web_detail_result_url` varchar(500) DEFAULT NULL COMMENT '抓取详情页url 对应file_name',
`save_path` varchar(500) DEFAULT NULL,
`company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
`province` varchar(50) DEFAULT NULL COMMENT '省',
`city` varchar(50) DEFAULT NULL COMMENT '市',
`district` varchar(50) DEFAULT NULL COMMENT '县',
`punish_type` varchar(50) DEFAULT NULL COMMENT '处罚类型',
`punish_time` varchar(255) DEFAULT '' COMMENT '处罚公布时间',
`punish_money` varchar(50) DEFAULT NULL COMMENT '处罚金额',
`update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
`creater` int(11) DEFAULT NULL COMMENT '创建者',
`updater` int(11) DEFAULT NULL COMMENT '更新者',
`punish_no` varchar(255) DEFAULT NULL COMMENT '处罚编号',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89812 DEFAULT CHARSET=utf8 COMMENT='网站抓取对应ipe结果';

DROP TABLE IF EXISTS `web_crawler_config_ipe`;
CREATE TABLE `web_crawler_config_ipe` (
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
`field_property_regular` varchar(1000) DEFAULT NULL COMMENT '字段获取xpath配置格式[{field:"xx",type:''xpath'',"pathValue":"xpath规则",attrType:''text/attr'',attrDom:''attrType == attr时有效，值为attr的属性例如（href, id, name ,或者自定义的）''},{field:"xx",type:''value'',"pathValue":"固定值"},...]',
`creater` int(11) DEFAULT NULL COMMENT '创建者',
`updater` int(11) DEFAULT NULL COMMENT '更新者',
`city` varchar(50) DEFAULT NULL COMMENT '网站地区',
`area` varchar(50) DEFAULT NULL COMMENT '网站区域',
`source_type` varchar(50) DEFAULT NULL COMMENT '来源类型',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='网站抓取IPE配置表';




insert into 'sys_ment' (`id`, `name`, `url`, `parent_id`, `order_num`, `close_icon`, `open_icon`, `status`, `creater`, `created_time`, `updater`, `updated_time`, `remark`)
 values(32, '爬虫配置Ipe', '../crawlerIpe/listPage.do', 4, 15, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);



INSERT INTO `web_crawler_config_ipe` (`id`, `web_name`, `web_domain`, `web_search_url`, `page_url_regular`, `page_type`, `max_page`, `page_req_method`, `page_result`, `replace_regular`, `detail_url_regular`, `detail_title_regular`, `create_time`, `update_time`, `start_page`, `attr_type`, `attr_name`, `detail_content_regular`, `field_property_regular`, `creater`, `updater`, `city`, `area`, `source_type`) VALUES
	(1, '重庆市环保局', 'www.cepb.gov.cn', 'http://www.cepb.gov.cn/xxgk/hjgl/xzcf/xzcfjd/index.shtml', 'http://www.cepb.gov.cn/xxgk/hjgl/xzcf/xzcfjd/index_${page}.shtml', 1, 15, 1, 'div[class=channelpages]', '\\S+条共有|条\\S+', 'http://www.cepb.gov.cn/doc/\\d{4}/\\d{2}/\\d{2}/\\d+.shtml', '//div[@class=\'mainCont\']/h2/tidyText()', '2019-01-08 20:22:54', '2019-01-08 20:20:15', 2, 'text', '', '//div[@class=\'simplebox mgt10\']/html()', '[{"field":"company_name","type":"xpath","pathValue":"div[id=Zoom] p:first","attrType":"text","attrDom":""},{"field":"province","type":"text","pathValue":"重庆","attrType":"text","attrDom":""},{"field":"city","type":"text","pathValue":"重庆市","attrType":"text","attrDom":""},{"field":"punish_type","type":"xpath","pathValue":"div[id=Zoom] p:eq(1)","attrType":"text","attrDom":""},{"field":"punish_time","type":"xpath","pathValue":"p[class=explain] em","attrType":"text","attrDom":""}]', 2, NULL, '重庆市', '重庆市', '重庆市环保局');

DROP TABLE IF EXISTS `crawler_ipe_industry_record`;
CREATE TABLE `crawler_ipe_industry_record` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
  `web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
  `year` varchar(10) DEFAULT NULL COMMENT '年度',
  `web_detail_name` varchar(500) DEFAULT NULL COMMENT '详情标题 对应title',
  `web_detail_url` varchar(500) DEFAULT NULL COMMENT '详情页原url',
  `web_detail_result_url` varchar(500) DEFAULT NULL COMMENT '抓取详情页url 对应file_name',
  `save_path` varchar(500) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `district` varchar(50) DEFAULT NULL COMMENT '县',
  `punish_type` varchar(50) DEFAULT NULL COMMENT '处罚类型',
  `punish_time` varchar(20) DEFAULT 'null' COMMENT '处罚公布时间',
  `punish_money` varchar(20) DEFAULT 'null' COMMENT '处罚金额',
  `punish_no` varchar(100) DEFAULT NULL COMMENT '处罚编号',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89812 DEFAULT CHARSET=utf8 COMMENT='网站抓取对应ipe结果';

CREATE TABLE `excel_ipe_industry_record` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `year` varchar(10) DEFAULT NULL COMMENT '年度',
  `web_detail_url` varchar(500) DEFAULT NULL COMMENT '详情页原url',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `district` varchar(50) DEFAULT NULL COMMENT '县',
  `punish_type` varchar(50) DEFAULT NULL COMMENT '处罚类型',
  `punish_time` varchar(20) DEFAULT 'null' COMMENT '处罚公布时间',
  `punish_money` varchar(20) DEFAULT NULL COMMENT '处罚金额',
  `punish_no` varchar(100) DEFAULT NULL COMMENT '处罚编号',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91519 DEFAULT CHARSET=utf8 COMMENT='excel导入对应ipe结果';


DROP TABLE IF EXISTS `ipe_industry_record`;
CREATE TABLE `ipe_industry_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `year` varchar(10) DEFAULT NULL COMMENT '年度',
  `title` varchar(1000) DEFAULT NULL COMMENT '标题',
  `ipe_id` bigint(20) DEFAULT NULL COMMENT 'ipe记录ID',
  `file_name` varchar(100) DEFAULT NULL COMMENT '文件名称',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `district` varchar(50) DEFAULT NULL COMMENT '县',
  `web_detail_url` varchar(500) DEFAULT NULL COMMENT '详情页原url',
  `punish_type` varchar(50) DEFAULT NULL COMMENT '处罚类型',
  `punish_time` varchar(20) DEFAULT NULL COMMENT '处罚公布时间',
  `punish_money` varchar(20) DEFAULT NULL COMMENT '处罚金额',
  `punish_no` varchar(100) DEFAULT NULL COMMENT '处罚编号',
  `source` int(11) DEFAULT NULL COMMENT '数据来源：1ipe,2爬虫，3Excel导入',
  PRIMARY KEY (`id`),
  KEY `industry_index` (`regist_item_id`,`year`)
) ENGINE=InnoDB AUTO_INCREMENT=959571 DEFAULT CHARSET=utf8 COMMENT='ipe监管记录';


INSERT INTO `web_crawler_config_ipe` VALUES (1,'重庆市环保局','www.cepb.gov.cn','http://www.cepb.gov.cn/xxgk/hjgl/xzcf/xzcfjd/index.shtml','http://www.cepb.gov.cn/xxgk/hjgl/xzcf/xzcfjd/index_${page}.shtml',1,15,1,'div[class=channelpages]','\\S+条共有|条\\S+','http://www.cepb.gov.cn/doc/\\d{4}/\\d{2}/\\d{2}/\\d+.shtml','//div[@class=\'mainCont\']/h1/tidyText()','2019-01-10 22:57:21','2019-01-08 20:20:15',2,'text','','//div[@class=\'simplebox mgt10\']/html()','[{\"field\":\"companyName\",\"type\":\"xpath\",\"pathValue\":\"div[id=Zoom] p:eq(1)\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"province\",\"type\":\"text\",\"pathValue\":\"重庆\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"city\",\"type\":\"text\",\"pathValue\":\"重庆市\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishType\",\"type\":\"xpath\",\"pathValue\":\"div[id=Zoom] p:eq(2)\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishTime\",\"type\":\"xpath\",\"pathValue\":\"p[class=explain] em\",\"attrType\":\"text\",\"attrDom\":\"\"}]',2,NULL,'重庆市','重庆市','重庆市环保局','GET','GET','null'),(3,'信用中国','www.creditjx.gov.cn','http://www.creditjx.gov.cn/DataQuery/doublePublicity/queryDoublePublicityList.json?tableType=2&inpParam=&orgIdOrRegionId=2EB078AFA4A35251E050007F010076D8&page=1','http://www.creditjx.gov.cn/DataQuery/doublePublicity/queryDoublePublicityList.json?tableType=2&inpParam=&orgIdOrRegionId=2EB078AFA4A35251E050007F010076D8&page=1',2,3,3,'$.pageCount','','http://www.creditjx.gov.cn/DataQuery/doublePublicity/getPenaltyDetail.json?id=','$.domain.CFCFMC','2019-01-13 02:27:02','2019-01-13 02:27:02',1,'text','','$.domain.CFJG','[{\"field\":\"companyName\",\"type\":\"XJson\",\"pathValue\":\"$.domain.CFXDRMC\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"province\",\"type\":\"text\",\"pathValue\":\"江西\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"city\",\"type\":\"text\",\"pathValue\":\"江西\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishType\",\"type\":\"XJson\",\"pathValue\":\"$.domain.CFCFLB1TEXT\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishTime\",\"type\":\"XJson\",\"pathValue\":\"$.domain.CFJDRQ\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishNo\",\"type\":\"XJson\",\"pathValue\":\"$.domain.CFWSH\",\"attrType\":\"text\",\"attrDom\":\"\"}]',2,2,'江西','江西','江西','POST','$.list[*].ID',NULL);

ALTER TABLE `web_crawler_config_ipe`
  ADD COLUMN `request_method` VARCHAR(50) NULL DEFAULT 'GET' COMMENT '请求方式 GET POST',
  ADD COLUMN `detail_by_id` VARCHAR(50) NULL DEFAULT null COMMENT '列表返回为json时，详情页入参数据获取(列表页获取)',
  CHANGE  column  `field_property_regular` `field_property_regular`VARCHAR(1000) NULL DEFAULT null COMMENT '字段获取xpath配置格式[{field:"xx",type:''xpath'',"pathValue":"xpath规则",attrType:''text/attr'',attrDom:''attrType == attr时有效，值为attr的属性例如（href, id, name ,或者自定义的）''},{field:"xx",type:''value'',"pathValue":"固定值"},...]';


ALTER TABLE `crawler_ipe_industry_record`
  ADD COLUMN `error_msg` VARCHAR(500) NULL DEFAULT null COMMENT '爬虫失败信息';

ALTER TABLE `crawler_ipe_industry_record`
  ADD COLUMN `punish_reason` VARCHAR(500) NULL DEFAULT null COMMENT '处罚原因',
  ADD COLUMN `majority_type` VARCHAR(100) NULL DEFAULT null COMMENT '污染类型';

ALTER TABLE `ipe_industry_record`
  ADD COLUMN `punish_reason` VARCHAR(500) NULL DEFAULT null COMMENT '处罚原因',
  ADD COLUMN `majority_type` VARCHAR(100) NULL DEFAULT null COMMENT '污染类型';


alter table ipe_industry_record modify column web_detail_url varchar(2000);
alter table crawler_ipe_industry_record modify column web_detail_url varchar(2000);
alter table excel_ipe_industry_record modify column web_detail_url varchar(2000);

ALTER TABLE `excel_ipe_industry_record`
  ADD COLUMN `punish_reason` VARCHAR(500) NULL DEFAULT null COMMENT '处罚原因',
  ADD COLUMN `majority_type` VARCHAR(100) NULL DEFAULT null COMMENT '污染类型';