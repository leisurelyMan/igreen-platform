create table company_query_config
(
   id                   int not null auto_increment comment 'id',
   name                 varchar(255) comment '名称',
   state                int comment '状态',
   creater              int comment '创建者',
   created_time         timestamp comment '创建时间',
   updater              int comment '更新者',
   updated_time         timestamp comment '更新时间',
   primary key (id)
);

alter table company_query_config comment '公司查询配置表';

create table company_query_detail
(
   id                   int not null auto_increment comment 'id',
   company_name         varchar(255) comment '公司名称',
   regist_item_id       int comment '公司ID',
   config_id            int comment '配置ID',
   state                int comment '状态',
   creater              int comment '创建者',
   created_time         timestamp comment '创建时间',
   updater              int comment '更新者',
   updated_time         timestamp comment '更新时间',
   primary key (id)
);

alter table company_query_detail comment '公司查询详情';


ALTER TABLE `company_query_detail`
ADD COLUMN `qichacha_key_no`  varchar(40) NULL COMMENT '企查查基础信息' AFTER `regist_item_id`;

DROP TABLE IF EXISTS `company_query_qichacha_company_base`;
CREATE TABLE `company_query_qichacha_company_base` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `base_id` int(11) NOT NULL COMMENT 'base_id',
  `key_no` varchar(40) NOT NULL COMMENT 'KeyNo',
  `name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `start_date` varchar(50) DEFAULT NULL COMMENT '注册时间',
  `province` varchar(10) DEFAULT NULL COMMENT '省编码',
  `industry_code` varchar(10) DEFAULT NULL COMMENT '行业编码',
  `subIndustry_code` varchar(10) DEFAULT NULL COMMENT '细分行业编码',
  `industry` varchar(100) DEFAULT NULL COMMENT '行业',
  `subIndustry` varchar(100) DEFAULT NULL COMMENT '细分行业',
  `credit_code` varchar(50) DEFAULT NULL COMMENT '注册编码',
  `regist_capi` varchar(50) DEFAULT NULL COMMENT '注册资本',
  `econ_kind` varchar(100) DEFAULT NULL COMMENT '经营形式',
  `scope` text COMMENT '经营范围',
  `org_no` varchar(20) DEFAULT NULL COMMENT '组织机构代码',
  `status` varchar(100) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`base_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='company_query_qichacha_company_base';

DROP TABLE IF EXISTS `company_query_qichacha_judgement`;
CREATE TABLE `company_query_qichacha_judgement` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'row_content',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `judgement_id` varchar(20) NOT NULL COMMENT 'judgement_id',
  `key_no` varchar(40) DEFAULT NULL COMMENT 'key_no',
  `t_id` varchar(40) DEFAULT NULL COMMENT 't_id',
  `court` varchar(255) DEFAULT NULL COMMENT '执行法院',
  `case_name` varchar(255) DEFAULT NULL COMMENT '处罚名称',
  `case_no` varchar(100) DEFAULT NULL COMMENT '处罚编号',
  `case_type` varchar(10) DEFAULT NULL COMMENT '处罚类型',
  `submit_date` varchar(30) DEFAULT NULL COMMENT '提交时间',
  `is_prosecutor` varchar(10) DEFAULT NULL COMMENT '是否为起诉人',
  `is_defendant` varchar(10) DEFAULT NULL COMMENT '是否为被告',
  `update_date` varchar(30) DEFAULT NULL COMMENT '更新时间',
  `court_year` varchar(10) DEFAULT NULL COMMENT '年度',
  `case_role` text COMMENT '角色',
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`judgement_id`),
  KEY `idx_qichacha_judgement` (`key_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='company_query_qichacha_judgement';

DROP TABLE IF EXISTS `company_query_qichacha_patent`;
CREATE TABLE `company_query_qichacha_patent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `patent_id` varchar(20) NOT NULL COMMENT 'patent_id',
  `key_no` varchar(35) DEFAULT NULL COMMENT 'key_no',
  `key_nop` varchar(35) DEFAULT NULL COMMENT 'key_nop',
  `ipc_list` varchar(10) DEFAULT NULL COMMENT '专利类别',
  `kind_code` varchar(10) DEFAULT NULL COMMENT '种类code',
  `application_number` varchar(20) DEFAULT NULL COMMENT '申请编号',
  `application_date` varchar(20) DEFAULT NULL COMMENT '申请时间',
  `publication_number` varchar(20) DEFAULT NULL COMMENT '发布编号',
  `publication_date` varchar(20) DEFAULT NULL COMMENT '发布时间',
  `legal_status` varchar(10) DEFAULT NULL COMMENT '法定状态',
  `legal_status_desc` varchar(20) DEFAULT NULL COMMENT '法定状态描述',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `agency` varchar(200) DEFAULT NULL COMMENT '代理机构',
  `kind_code_desc` varchar(20) DEFAULT NULL COMMENT '种类描述',
  `ipc_desc` varchar(255) DEFAULT NULL COMMENT '专利类别描述',
  `inventor_string_list` varchar(200) DEFAULT NULL COMMENT '发明人',
  `assigneestring_list` varchar(200) DEFAULT NULL COMMENT '代理人',
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`patent_id`),
  KEY `idx_qichacha_patent` (`key_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='company_query_qichacha_patent';

DROP TABLE IF EXISTS `company_query_monitor_company`;
CREATE TABLE `company_query_monitor_company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `monitor_company_id` int(11) NOT NULL COMMENT 'monitor_company_id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `monitor_sequence` int(11) DEFAULT NULL COMMENT '序号',
  `region_code` varchar(20) DEFAULT NULL COMMENT '行政区划代码',
  `legal_person_code` varchar(100) DEFAULT NULL COMMENT '法人代码',
  `company_name` varchar(100) DEFAULT NULL COMMENT '企业名称',
  `monitor_type` varchar(100) DEFAULT NULL COMMENT '监控类别',
  `province` varchar(50) DEFAULT NULL COMMENT '所属省份',
  `monitor_year` varchar(20) DEFAULT NULL COMMENT '所属年份',
  `create_tm` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`monitor_company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='国家重点监控企业名单';

DROP TABLE IF EXISTS `company_query_pollution_discharge_license`;
CREATE TABLE `company_query_pollution_discharge_license` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `license_id` int(11) NOT NULL COMMENT 'license_id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `province` varchar(16) DEFAULT NULL COMMENT '省',
  `city` varchar(32) DEFAULT NULL COMMENT '城市',
  `license_number` varchar(32) DEFAULT NULL COMMENT '许可证编号',
  `company_name` varchar(32) DEFAULT NULL COMMENT '公司名称',
  `industry` varchar(16) DEFAULT NULL COMMENT '行业类别',
  `valid_date` varchar(100) DEFAULT NULL COMMENT '许可证有效日期',
  `start_valid_date` date DEFAULT NULL COMMENT '许可证有效起始日期',
  `end_valid_date` date DEFAULT NULL COMMENT '许可证有效终止日期',
  `certification_date` date DEFAULT NULL COMMENT '发证日期',
  `data_id` varchar(100) DEFAULT NULL COMMENT '排污详情数据ID，爬虫用',
  `address` varchar(100) DEFAULT NULL COMMENT '公司地址',
  `certificate_organization` varchar(100) DEFAULT NULL COMMENT '发证机关',
  `pollution_type` varchar(1000) DEFAULT NULL COMMENT '主要污染类别',
  `air_pollution_type` varchar(1000) DEFAULT NULL COMMENT '大气主要污染物种类',
  `air_pollution_discharge_rule` varchar(1000) DEFAULT NULL COMMENT '大气污染物排放规律',
  `air_pollution_discharge_standard` varchar(1000) DEFAULT NULL COMMENT '大气污染物排放执行标准',
  `water_pollution_type` varchar(1000) DEFAULT NULL COMMENT '废水主要污染物种类',
  `water_pollution_discharge_rule` varchar(1000) DEFAULT NULL COMMENT '废水污染物排放规律',
  `water_pollution_discharge_standard` varchar(1000) DEFAULT NULL COMMENT '废水污染物排放执行标准',
  `pollution_trade` varchar(1000) DEFAULT NULL COMMENT '排污权使用和交易信息',
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`license_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='排污许可信息表';

DROP TABLE IF EXISTS `company_query_execution_record`;
CREATE TABLE `company_query_execution_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `execution_record_id` int(11) NOT NULL COMMENT 'execution_record_id',
  `pollution_id` int(11) NOT NULL COMMENT '排污许可信息表外键',
  `content` text COMMENT '主要内容',
  `frequency` varchar(1000) DEFAULT NULL COMMENT '上报频次',
  `other_info` text COMMENT '其他信息',
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`execution_record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='company_query_execution_record';


DROP TABLE IF EXISTS `company_query_clean_production_company`;
CREATE TABLE `company_query_clean_production_company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `clean_production_company_id` int(11) NOT NULL COMMENT 'clean_production_company_id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记企业主键',
  `check_year` varchar(10) DEFAULT NULL COMMENT '年份',
  `batch_no` varchar(10) DEFAULT NULL COMMENT '批次',
  `city` varchar(20) DEFAULT NULL COMMENT '城市',
  `serial_number` varchar(100) DEFAULT NULL COMMENT '编号',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `trade` varchar(100) DEFAULT NULL COMMENT '行业',
  `product_sales_amount` varchar(500) DEFAULT NULL COMMENT '主要产品及年产量',
  `region` varchar(100) DEFAULT NULL COMMENT '所属地区',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `report_time` varchar(20) DEFAULT NULL COMMENT '公布时间',
  `submit_check_time` varchar(20) DEFAULT NULL COMMENT '提交审核时间',
  `complete_estimate_time` varchar(20) DEFAULT NULL COMMENT '完成评估时间',
  `complete_check_time` varchar(20) DEFAULT NULL COMMENT '完成验收时间',
  `check_organization` varchar(200) DEFAULT NULL COMMENT '审核咨询机构名称',
  `create_tm` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `query_index` (`data_version`,`clean_production_company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='环保部清洁生产企业';


DROP TABLE IF EXISTS `company_query_excel_energy_efficiency_label`;
CREATE TABLE `company_query_excel_energy_efficiency_label` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `data_version` int(11) NOT NULL COMMENT 'data_version',  
  `energy_efficiency_label_id` bigint(20) NOT NULL COMMENT 'energy_efficiency_label_id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '公司信息ID',
  `notice_no` varchar(100) DEFAULT NULL COMMENT '公告号',
  `filing_company` varchar(255) DEFAULT NULL COMMENT '备案单位',
  `company_type` varchar(100) DEFAULT NULL COMMENT '公司类型',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`),
  KEY `query_index` (`data_version`,`energy_efficiency_label_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='能效指标备案：实验室公告';
