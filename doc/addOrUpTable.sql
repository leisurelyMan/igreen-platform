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
  `punish_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '处罚公布时间',
  `punish_money` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '处罚金额',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89812 DEFAULT CHARSET=utf8 COMMENT='网站抓取对应ipe结果';