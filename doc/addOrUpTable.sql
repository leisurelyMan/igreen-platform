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
`field_property_regular` varchar(500) DEFAULT NULL COMMENT '字段获取xpath配置格式[{field:"xx",type:''xpath'',"pathValue":"xpath规则",attrType:''text/attr'',attrDom:''attrType == attr时有效，值为attr的属性例如（href, id, name ,或者自定义的）''},{field:"xx",type:''value'',"pathValue":"固定值"},...]',
`creater` int(11) DEFAULT NULL COMMENT '创建者',
`updater` int(11) DEFAULT NULL COMMENT '更新者',
`city` varchar(50) DEFAULT NULL COMMENT '网站地区',
`area` varchar(50) DEFAULT NULL COMMENT '网站区域',
`source_type` varchar(50) DEFAULT NULL COMMENT '来源类型',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='网站抓取IPE配置表';




insert into 'sys_ment' (`id`, `name`, `url`, `parent_id`, `order_num`, `close_icon`, `open_icon`, `status`, `creater`, `created_time`, `updater`, `updated_time`, `remark`)
 values(32, '爬虫配置Ipe', '../crawlerIpe/listPage.do', 4, 15, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);


INSERT INTO `web_crawler_config_ipe` VALUES (1,'重庆市环保局','www.cepb.gov.cn','http://www.cepb.gov.cn/xxgk/hjgl/xzcf/xzcfjd/index.shtml','http://www.cepb.gov.cn/xxgk/hjgl/xzcf/xzcfjd/index_${page}.shtml',1,15,1,'div[class=channelpages]','\\S+条共有|条\\S+','http://www.cepb.gov.cn/doc/\\d{4}/\\d{2}/\\d{2}/\\d+.shtml','//div[@class=\'mainCont\']/h1/tidyText()','2019-01-10 22:57:21','2019-01-08 20:20:15',2,'text','','//div[@class=\'simplebox mgt10\']/html()','[{\"field\":\"companyName\",\"type\":\"xpath\",\"pathValue\":\"div[id=Zoom] p:eq(1)\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"province\",\"type\":\"text\",\"pathValue\":\"重庆\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"city\",\"type\":\"text\",\"pathValue\":\"重庆市\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishType\",\"type\":\"xpath\",\"pathValue\":\"div[id=Zoom] p:eq(2)\",\"attrType\":\"text\",\"attrDom\":\"\"},{\"field\":\"punishTime\",\"type\":\"xpath\",\"pathValue\":\"p[class=explain] em\",\"attrType\":\"text\",\"attrDom\":\"\"}]',2,NULL,'重庆市','重庆市','重庆市环保局');