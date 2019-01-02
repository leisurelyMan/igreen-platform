/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : igreen

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2019-01-02 22:48:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `administrative_penalty`
-- ----------------------------
DROP TABLE IF EXISTS `administrative_penalty`;
CREATE TABLE `administrative_penalty` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `crime_time` varchar(20) DEFAULT NULL COMMENT '案发时间',
  `crime_reason` varchar(2000) DEFAULT NULL COMMENT '案由',
  `case_type` varchar(2000) DEFAULT NULL COMMENT '案件类型',
  `execute_type` varchar(2000) DEFAULT NULL COMMENT '执行类别',
  `case_result` varchar(2000) DEFAULT NULL COMMENT '案件结果',
  `punish_time` varchar(20) DEFAULT NULL COMMENT '处罚决定书签发日期',
  `punish_office` varchar(255) DEFAULT NULL COMMENT '处罚机关',
  `fact_malfeasance` varchar(2000) DEFAULT NULL COMMENT '主要违法事实',
  `punish_base` varchar(2000) DEFAULT NULL COMMENT '处罚依据',
  `punish_type` varchar(2000) DEFAULT NULL COMMENT '处罚种类',
  `punish_result` varchar(2000) DEFAULT NULL COMMENT '处罚结果',
  `punish_amount` decimal(16,2) DEFAULT NULL COMMENT '处罚金额',
  `punishment` varchar(2000) DEFAULT NULL COMMENT '处罚执行情况',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8 COMMENT='行政处罚信息';

-- ----------------------------
-- Records of administrative_penalty
-- ----------------------------

-- ----------------------------
-- Table structure for `air_quality`
-- ----------------------------
DROP TABLE IF EXISTS `air_quality`;
CREATE TABLE `air_quality` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `record_date` date DEFAULT NULL COMMENT '日期',
  `city` varchar(32) DEFAULT NULL COMMENT '城市',
  `air_quality_index` varchar(32) DEFAULT NULL COMMENT 'AQI指数',
  `main_pollutant` varchar(32) DEFAULT NULL COMMENT '首要污染物',
  `status` varchar(16) DEFAULT NULL COMMENT '空气质量级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=437899 DEFAULT CHARSET=utf8 COMMENT='环保部空气质量表';

-- ----------------------------
-- Records of air_quality
-- ----------------------------

-- ----------------------------
-- Table structure for `ai_ipe`
-- ----------------------------
DROP TABLE IF EXISTS `ai_ipe`;
CREATE TABLE `ai_ipe` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `season` varchar(20) DEFAULT NULL COMMENT '季度',
  `fine` varchar(20) DEFAULT NULL COMMENT '罚款',
  `revoked` varchar(20) DEFAULT NULL COMMENT '暂扣、吊销许可证',
  `confiscate` varchar(20) DEFAULT NULL COMMENT '没收违法所得',
  `detention` varchar(20) DEFAULT NULL COMMENT '行政拘留',
  `production` varchar(20) DEFAULT NULL COMMENT '责令停产整顿',
  `instruct` varchar(20) DEFAULT NULL COMMENT '责令停产、停业、关闭',
  `other` varchar(20) DEFAULT NULL COMMENT 'other',
  `total_sum` varchar(20) DEFAULT NULL COMMENT '总计',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '公司ID',
  `qichacha_key_no` varchar(40) DEFAULT NULL COMMENT '企查查keyno',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=225 DEFAULT CHARSET=utf8 COMMENT='IPE预测';

-- ----------------------------
-- Records of ai_ipe
-- ----------------------------

-- ----------------------------
-- Table structure for `branch`
-- ----------------------------
DROP TABLE IF EXISTS `branch`;
CREATE TABLE `branch` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `branch_name` varchar(255) DEFAULT NULL COMMENT '分支机构名称',
  `branch_regist_no` varchar(100) DEFAULT NULL COMMENT '分支机构企业注册号',
  `principal` varchar(255) DEFAULT NULL COMMENT '分支机构负责人',
  `general` varchar(1000) DEFAULT NULL COMMENT '一般经营项目',
  `address` varchar(1000) DEFAULT NULL COMMENT '分支机构地址',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='分支机构信息';

-- ----------------------------
-- Records of branch
-- ----------------------------

-- ----------------------------
-- Table structure for `brand`
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `brand_name` varchar(255) DEFAULT NULL COMMENT '商标名称',
  `apply_time` varchar(100) DEFAULT NULL COMMENT '申请日期',
  `brand_status` varchar(100) DEFAULT NULL COMMENT '商标状态',
  `regist_no` varchar(100) DEFAULT NULL COMMENT '注册号',
  `brand_type` varchar(100) DEFAULT NULL COMMENT '类别',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='商标信息';

-- ----------------------------
-- Records of brand
-- ----------------------------

-- ----------------------------
-- Table structure for `break_promise_executed`
-- ----------------------------
DROP TABLE IF EXISTS `break_promise_executed`;
CREATE TABLE `break_promise_executed` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `case_filing_time` varchar(20) DEFAULT NULL COMMENT '立案时间',
  `legal_person` varchar(100) DEFAULT NULL COMMENT '法定代表人',
  `organization_no` varchar(100) DEFAULT NULL COMMENT '组织机构号',
  `obligation` varchar(255) DEFAULT NULL COMMENT '生效法律文书确定的义务',
  `executed_condition` varchar(255) DEFAULT NULL COMMENT '失信被执行人为具体情形',
  `perform_condition` varchar(255) DEFAULT NULL COMMENT '被执行人的履行情况',
  `nonperforming` varchar(255) DEFAULT NULL COMMENT '全部未履行',
  `publish_time` varchar(20) DEFAULT NULL COMMENT '公布时间',
  `province` varchar(100) DEFAULT NULL COMMENT '省份',
  `according_no` varchar(20) DEFAULT NULL COMMENT '执行依据文号',
  `execute_court` varchar(255) DEFAULT NULL COMMENT '执行法院',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='失信被执行人信息';

-- ----------------------------
-- Records of break_promise_executed
-- ----------------------------

-- ----------------------------
-- Table structure for `chattel_mortgage`
-- ----------------------------
DROP TABLE IF EXISTS `chattel_mortgage`;
CREATE TABLE `chattel_mortgage` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `mortgage_id` varchar(255) DEFAULT NULL COMMENT '抵押ID',
  `mortgagee` varchar(255) DEFAULT NULL COMMENT '抵押人',
  `pledgee` varchar(255) DEFAULT NULL COMMENT '抵押权人',
  `regist_office` varchar(255) DEFAULT NULL COMMENT '登记机关',
  `regist_time` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `mortgage_status` varchar(20) DEFAULT NULL COMMENT '状态标识',
  `regist_no` varchar(100) DEFAULT NULL COMMENT '登记证号',
  `mortgage_reason` varchar(255) DEFAULT NULL COMMENT '申请抵押原因',
  `creditor_type` varchar(100) DEFAULT NULL COMMENT '被担保主债权种类',
  `creditor_amount` decimal(16,2) DEFAULT NULL COMMENT '被担保主债权数额(万元)',
  `begin_time` varchar(20) DEFAULT NULL COMMENT '履约起始日期',
  `end_time` varchar(20) DEFAULT NULL COMMENT '履约截止日期',
  `cancel_time` varchar(20) DEFAULT NULL COMMENT '注销日期',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='动产抵押信息';

-- ----------------------------
-- Records of chattel_mortgage
-- ----------------------------

-- ----------------------------
-- Table structure for `clean_production_company`
-- ----------------------------
DROP TABLE IF EXISTS `clean_production_company`;
CREATE TABLE `clean_production_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17980 DEFAULT CHARSET=utf8 COMMENT='环保部清洁生产企业';

-- ----------------------------
-- Records of clean_production_company
-- ----------------------------

-- ----------------------------
-- Table structure for `company_employee`
-- ----------------------------
DROP TABLE IF EXISTS `company_employee`;
CREATE TABLE `company_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `name` varchar(100) DEFAULT NULL COMMENT '人员姓名',
  `job` varchar(255) DEFAULT NULL COMMENT '职务',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='主要人员信息';

-- ----------------------------
-- Records of company_employee
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_clean_production_company`
-- ----------------------------
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环保部清洁生产企业';

-- ----------------------------
-- Records of company_query_clean_production_company
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_config`
-- ----------------------------
DROP TABLE IF EXISTS `company_query_config`;
CREATE TABLE `company_query_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='公司查询配置表';

-- ----------------------------
-- Records of company_query_config
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_detail`
-- ----------------------------
DROP TABLE IF EXISTS `company_query_detail`;
CREATE TABLE `company_query_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '公司ID',
  `qichacha_key_no` varchar(40) DEFAULT NULL COMMENT '企查查基础信息',
  `config_id` int(11) DEFAULT NULL COMMENT '配置ID',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8 COMMENT='公司查询详情';

-- ----------------------------
-- Records of company_query_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_excel_energy_efficiency_label`
-- ----------------------------
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='能效指标备案：实验室公告';

-- ----------------------------
-- Records of company_query_excel_energy_efficiency_label
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_execution_record`
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='company_query_execution_record';

-- ----------------------------
-- Records of company_query_execution_record
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_monitor_company`
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8 COMMENT='国家重点监控企业名单';

-- ----------------------------
-- Records of company_query_monitor_company
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_pollution_discharge_license`
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='排污许可信息表';

-- ----------------------------
-- Records of company_query_pollution_discharge_license
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_qichacha_company_base`
-- ----------------------------
DROP TABLE IF EXISTS `company_query_qichacha_company_base`;
CREATE TABLE `company_query_qichacha_company_base` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `data_version` int(11) NOT NULL COMMENT 'data_version',
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
  KEY `query_index` (`data_version`,`key_no`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8 COMMENT='company_query_qichacha_company_base';

-- ----------------------------
-- Records of company_query_qichacha_company_base
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_qichacha_judgement`
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8 COMMENT='company_query_qichacha_judgement';

-- ----------------------------
-- Records of company_query_qichacha_judgement
-- ----------------------------

-- ----------------------------
-- Table structure for `company_query_qichacha_patent`
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=241 DEFAULT CHARSET=utf8 COMMENT='company_query_qichacha_patent';

-- ----------------------------
-- Records of company_query_qichacha_patent
-- ----------------------------

-- ----------------------------
-- Table structure for `copyright`
-- ----------------------------
DROP TABLE IF EXISTS `copyright`;
CREATE TABLE `copyright` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `production_name` varchar(255) DEFAULT NULL COMMENT '作品名称',
  `regist_no` varchar(100) DEFAULT NULL COMMENT '登记号',
  `production_type` varchar(100) DEFAULT NULL COMMENT '类别',
  `complete_time` varchar(20) DEFAULT NULL COMMENT '创作完成日期',
  `regist_time` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `first_publish_time` varchar(20) DEFAULT NULL COMMENT '首次发布日期',
  `last_update_time` varchar(20) DEFAULT NULL COMMENT '最后更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='著作权信息';

-- ----------------------------
-- Records of copyright
-- ----------------------------

-- ----------------------------
-- Table structure for `court_notice`
-- ----------------------------
DROP TABLE IF EXISTS `court_notice`;
CREATE TABLE `court_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `notice_time` varchar(20) DEFAULT NULL COMMENT '时间',
  `notice_type` varchar(20) DEFAULT NULL COMMENT '公告类型',
  `court` varchar(255) DEFAULT NULL COMMENT '法院',
  `notice` varchar(255) DEFAULT NULL COMMENT '公告内容',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='法院公告';

-- ----------------------------
-- Records of court_notice
-- ----------------------------

-- ----------------------------
-- Table structure for `domain_name`
-- ----------------------------
DROP TABLE IF EXISTS `domain_name`;
CREATE TABLE `domain_name` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `location` varchar(255) DEFAULT NULL COMMENT '网址',
  `location_name` varchar(255) DEFAULT NULL COMMENT '网址名称',
  `license_key` varchar(255) DEFAULT NULL COMMENT '网站备案/许可证号',
  `approve_regist_time` varchar(20) DEFAULT NULL COMMENT '登记批准日期',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='域名';

-- ----------------------------
-- Records of domain_name
-- ----------------------------

-- ----------------------------
-- Table structure for `energy_filing`
-- ----------------------------
DROP TABLE IF EXISTS `energy_filing`;
CREATE TABLE `energy_filing` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
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
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1142 DEFAULT CHARSET=utf8 COMMENT='能效指标备案：实验室公告';

-- ----------------------------
-- Records of energy_filing
-- ----------------------------

-- ----------------------------
-- Table structure for `energy_pacemaker`
-- ----------------------------
DROP TABLE IF EXISTS `energy_pacemaker`;
CREATE TABLE `energy_pacemaker` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `company` varchar(255) DEFAULT NULL COMMENT '公司',
  `energy` varchar(255) DEFAULT NULL COMMENT '单位能耗',
  `material` varchar(255) DEFAULT NULL COMMENT '原料',
  `domain` varchar(100) DEFAULT NULL COMMENT '行业',
  `publish_begin` varchar(50) DEFAULT NULL COMMENT '发布日期',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COMMENT='2016年度能效“领跑者”企业名单';

-- ----------------------------
-- Records of energy_pacemaker
-- ----------------------------

-- ----------------------------
-- Table structure for `energy_service_company`
-- ----------------------------
DROP TABLE IF EXISTS `energy_service_company`;
CREATE TABLE `energy_service_company` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `company` varchar(255) DEFAULT NULL COMMENT '公司',
  `domain` varchar(100) DEFAULT NULL COMMENT '领域',
  `level` varchar(100) DEFAULT NULL COMMENT '级别',
  `certificate_number` varchar(100) DEFAULT NULL COMMENT '证书编号',
  `certificate_begin` varchar(50) DEFAULT NULL COMMENT '发证日期',
  `certificate_end` varchar(50) DEFAULT NULL COMMENT '有效期截止时间',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=551 DEFAULT CHARSET=utf8 COMMENT='节能服务公司综合能力等级评价名单';

-- ----------------------------
-- Records of energy_service_company
-- ----------------------------

-- ----------------------------
-- Table structure for `energy_service_filing`
-- ----------------------------
DROP TABLE IF EXISTS `energy_service_filing`;
CREATE TABLE `energy_service_filing` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '公司信息ID',
  `filing_company` varchar(255) DEFAULT NULL COMMENT '备案单位',
  `primary_technology` varchar(255) DEFAULT NULL COMMENT '主要节能业务及技术产品',
  `province` varchar(100) DEFAULT NULL COMMENT '省',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `phone` varchar(100) DEFAULT NULL COMMENT '电话',
  `发布时间` varchar(50) DEFAULT NULL COMMENT '发布时间',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3243 DEFAULT CHARSET=utf8 COMMENT='节能服务公司备案';

-- ----------------------------
-- Records of energy_service_filing
-- ----------------------------

-- ----------------------------
-- Table structure for `envicloud_city_code`
-- ----------------------------
DROP TABLE IF EXISTS `envicloud_city_code`;
CREATE TABLE `envicloud_city_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `area_id` varchar(32) DEFAULT NULL COMMENT '编码',
  `name_en` varchar(32) DEFAULT NULL COMMENT '城市名称-英文',
  `name_cn` varchar(32) DEFAULT NULL COMMENT '城市名称-中文',
  `district_en` varchar(32) DEFAULT NULL COMMENT '行政区-英文',
  `district_cn` varchar(32) DEFAULT NULL COMMENT '行政区-中文',
  `prov_en` varchar(32) DEFAULT NULL COMMENT '国家-英文',
  `prov_cn` varchar(32) DEFAULT NULL COMMENT '国家-中文',
  `nation_en` varchar(32) DEFAULT NULL COMMENT '国家-英文',
  `nation_cn` varchar(32) DEFAULT NULL COMMENT '国家-中文',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2566 DEFAULT CHARSET=utf8 COMMENT='环境云城市编码表';

-- ----------------------------
-- Records of envicloud_city_code
-- ----------------------------

-- ----------------------------
-- Table structure for `environmental_protection_report_issue`
-- ----------------------------
DROP TABLE IF EXISTS `environmental_protection_report_issue`;
CREATE TABLE `environmental_protection_report_issue` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `report_sequence` int(11) DEFAULT NULL COMMENT '序号',
  `report_year` varchar(20) DEFAULT NULL COMMENT '年份',
  `report_month` varchar(20) DEFAULT NULL COMMENT '月份',
  `province` varchar(50) DEFAULT NULL COMMENT '省份',
  `company_name` varchar(100) DEFAULT NULL COMMENT '涉及企业',
  `report_issue` varchar(200) DEFAULT NULL COMMENT '存在问题',
  `deal_result` varchar(1000) DEFAULT NULL COMMENT '处理情况',
  `report_comment` varchar(20) DEFAULT NULL COMMENT '备注',
  `create_tm` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5231 DEFAULT CHARSET=utf8 COMMENT='环保举报热线群众举报案件情况';

-- ----------------------------
-- Records of environmental_protection_report_issue
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_energy_efficiency_label`
-- ----------------------------
DROP TABLE IF EXISTS `excel_energy_efficiency_label`;
CREATE TABLE `excel_energy_efficiency_label` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
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
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1142 DEFAULT CHARSET=utf8 COMMENT='能效指标备案：实验室公告';

-- ----------------------------
-- Records of excel_energy_efficiency_label
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_energy_excellence_case`
-- ----------------------------
DROP TABLE IF EXISTS `excel_energy_excellence_case`;
CREATE TABLE `excel_energy_excellence_case` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `company_type` varchar(50) DEFAULT NULL COMMENT '类别',
  `data_sources` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `published_organization` varchar(255) DEFAULT NULL COMMENT '发布机构',
  `update_at` varchar(12) DEFAULT NULL COMMENT '更新时间',
  `publish_at` varchar(12) DEFAULT NULL COMMENT '发布时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='优秀能源管理案例';

-- ----------------------------
-- Records of excel_energy_excellence_case
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_energy_level`
-- ----------------------------
DROP TABLE IF EXISTS `excel_energy_level`;
CREATE TABLE `excel_energy_level` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `company` varchar(255) DEFAULT NULL COMMENT '公司',
  `domain` varchar(100) DEFAULT NULL COMMENT '领域',
  `level` varchar(100) DEFAULT NULL COMMENT '级别',
  `certificate_number` varchar(100) DEFAULT NULL COMMENT '证书编号',
  `certificate_begin` varchar(50) DEFAULT NULL COMMENT '发证日期',
  `certificate_end` varchar(50) DEFAULT NULL COMMENT '有效期截止时间',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=551 DEFAULT CHARSET=utf8 COMMENT='节能服务公司综合能力等级评价名单';

-- ----------------------------
-- Records of excel_energy_level
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_energy_pacemaker`
-- ----------------------------
DROP TABLE IF EXISTS `excel_energy_pacemaker`;
CREATE TABLE `excel_energy_pacemaker` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `company` varchar(255) DEFAULT NULL COMMENT '公司',
  `energy` varchar(255) DEFAULT NULL COMMENT '单位能耗',
  `material` varchar(255) DEFAULT NULL COMMENT '原料',
  `domain` varchar(100) DEFAULT NULL COMMENT '行业',
  `publish_begin` varchar(50) DEFAULT NULL COMMENT '发布日期',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COMMENT='2016年度能效“领跑者”企业名单';

-- ----------------------------
-- Records of excel_energy_pacemaker
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_environmental_pollution_liability_insurance`
-- ----------------------------
DROP TABLE IF EXISTS `excel_environmental_pollution_liability_insurance`;
CREATE TABLE `excel_environmental_pollution_liability_insurance` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `province_name` varchar(100) DEFAULT NULL COMMENT '省份',
  `company_name` varchar(255) DEFAULT NULL COMMENT '备案单位',
  `year` varchar(10) DEFAULT NULL COMMENT '年份',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3782 DEFAULT CHARSET=utf8 COMMENT='环境污染责任保险';

-- ----------------------------
-- Records of excel_environmental_pollution_liability_insurance
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_epa_credit_grade`
-- ----------------------------
DROP TABLE IF EXISTS `excel_epa_credit_grade`;
CREATE TABLE `excel_epa_credit_grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `original_grade` varchar(20) DEFAULT NULL COMMENT '初评等级',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `data_sources` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `published_organization` varchar(255) DEFAULT NULL COMMENT '发布机构',
  `update_at` varchar(12) DEFAULT NULL COMMENT '更新时间',
  `publish_at` varchar(12) DEFAULT NULL COMMENT '发布时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=435 DEFAULT CHARSET=utf8 COMMENT='中国环保产业协会信用等级评价名单';

-- ----------------------------
-- Records of excel_epa_credit_grade
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_great_industrial_energy_supervision`
-- ----------------------------
DROP TABLE IF EXISTS `excel_great_industrial_energy_supervision`;
CREATE TABLE `excel_great_industrial_energy_supervision` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `supervise_type` varchar(255) DEFAULT NULL COMMENT '监察类型',
  `province` varchar(100) DEFAULT NULL COMMENT '省',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `data_sources` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `published_organization` varchar(255) DEFAULT NULL COMMENT '发布机构',
  `update_at` varchar(12) DEFAULT NULL COMMENT '更新时间',
  `publish_at` varchar(12) DEFAULT NULL COMMENT '发布时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4148 DEFAULT CHARSET=utf8 COMMENT='国家重大工业节能专项监察企业名单';

-- ----------------------------
-- Records of excel_great_industrial_energy_supervision
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_green_bal`
-- ----------------------------
DROP TABLE IF EXISTS `excel_green_bal`;
CREATE TABLE `excel_green_bal` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `industry` varchar(50) DEFAULT NULL COMMENT '行业',
  `province` varchar(100) DEFAULT NULL COMMENT '省',
  `recommend_type` varchar(100) DEFAULT NULL COMMENT '推荐类别',
  `recommend_organization` varchar(255) DEFAULT NULL COMMENT '推荐机构',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `data_sources` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `published_organization` varchar(255) DEFAULT NULL COMMENT '发布机构',
  `update_at` varchar(12) DEFAULT NULL COMMENT '更新时间',
  `publish_at` varchar(12) DEFAULT NULL COMMENT '发布时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=673 DEFAULT CHARSET=utf8 COMMENT='绿色矿山名单';

-- ----------------------------
-- Records of excel_green_bal
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_ndrc_energy_filing`
-- ----------------------------
DROP TABLE IF EXISTS `excel_ndrc_energy_filing`;
CREATE TABLE `excel_ndrc_energy_filing` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `main_business` varchar(255) DEFAULT NULL COMMENT '主营业务',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `telephone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `province` varchar(100) DEFAULT NULL COMMENT '省',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `data_sources` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `published_organization` varchar(255) DEFAULT NULL COMMENT '发布机构',
  `update_at` varchar(12) DEFAULT NULL COMMENT '更新时间',
  `publish_at` varchar(12) DEFAULT NULL COMMENT '发布时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3247 DEFAULT CHARSET=utf8 COMMENT='国家发改委节能服务备案企业名单';

-- ----------------------------
-- Records of excel_ndrc_energy_filing
-- ----------------------------

-- ----------------------------
-- Table structure for `excel_steel_clean`
-- ----------------------------
DROP TABLE IF EXISTS `excel_steel_clean`;
CREATE TABLE `excel_steel_clean` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `data_sources` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `published_organization` varchar(255) DEFAULT NULL COMMENT '发布机构',
  `update_at` varchar(12) DEFAULT NULL COMMENT '更新时间',
  `publish_at` varchar(12) DEFAULT NULL COMMENT '发布时间',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='中国钢铁工业清洁生产环境友好企业名单';

-- ----------------------------
-- Records of excel_steel_clean
-- ----------------------------

-- ----------------------------
-- Table structure for `exchange`
-- ----------------------------
DROP TABLE IF EXISTS `exchange`;
CREATE TABLE `exchange` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `exchange_item` varchar(255) DEFAULT NULL COMMENT '变更事项',
  `before_item` varchar(100) DEFAULT NULL COMMENT '变更前内容',
  `after_item` varchar(100) DEFAULT NULL COMMENT '变更后内容',
  `exchange_time` varchar(20) DEFAULT NULL COMMENT '变更日期',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='变更信息';

-- ----------------------------
-- Records of exchange
-- ----------------------------

-- ----------------------------
-- Table structure for `executed_item`
-- ----------------------------
DROP TABLE IF EXISTS `executed_item`;
CREATE TABLE `executed_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `case_filing_time` varchar(20) DEFAULT NULL COMMENT '立案时间',
  `case_status` varchar(20) DEFAULT NULL COMMENT '案件状态',
  `case_no` varchar(100) DEFAULT NULL COMMENT '案号',
  `execute_target` varchar(255) DEFAULT NULL COMMENT '执行标的',
  `execute_court` varchar(255) DEFAULT NULL COMMENT '执行法院',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='被执行人信息';

-- ----------------------------
-- Records of executed_item
-- ----------------------------

-- ----------------------------
-- Table structure for `execution_record`
-- ----------------------------
DROP TABLE IF EXISTS `execution_record`;
CREATE TABLE `execution_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pollution_id` int(11) NOT NULL COMMENT '排污许可信息表外键',
  `content` text COMMENT '主要内容',
  `frequency` varchar(1000) DEFAULT NULL COMMENT '上报频次',
  `other_info` text COMMENT '其他信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18817 DEFAULT CHARSET=utf8 COMMENT='执行（守法）报告表';

-- ----------------------------
-- Records of execution_record
-- ----------------------------

-- ----------------------------
-- Table structure for `freeze_stock_right`
-- ----------------------------
DROP TABLE IF EXISTS `freeze_stock_right`;
CREATE TABLE `freeze_stock_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `freeze_no` varchar(100) DEFAULT NULL COMMENT '冻结文号',
  `freeze_office` varchar(255) DEFAULT NULL COMMENT '冻结机关',
  `freeze_begin_time` varchar(20) DEFAULT NULL COMMENT '冻结起始日期',
  `freeze_end_time` varchar(20) DEFAULT NULL COMMENT '冻结截至日期',
  `freeze_amount` decimal(16,2) DEFAULT NULL COMMENT '冻结金额',
  `unfreeze_office` varchar(255) DEFAULT NULL COMMENT '解冻机关',
  `unfreeze_no` varchar(100) DEFAULT NULL COMMENT '解冻文号',
  `unfreeze_time` varchar(20) DEFAULT NULL COMMENT '解冻日期',
  `unfreeze_explain` varchar(255) DEFAULT NULL COMMENT '解冻说明',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='股权冻结信息';

-- ----------------------------
-- Records of freeze_stock_right
-- ----------------------------

-- ----------------------------
-- Table structure for `hot_stopwords`
-- ----------------------------
DROP TABLE IF EXISTS `hot_stopwords`;
CREATE TABLE `hot_stopwords` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `word` varchar(255) DEFAULT NULL COMMENT '热词',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='自定义停用词库';

-- ----------------------------
-- Records of hot_stopwords
-- ----------------------------

-- ----------------------------
-- Table structure for `hot_words`
-- ----------------------------
DROP TABLE IF EXISTS `hot_words`;
CREATE TABLE `hot_words` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `word` varchar(255) DEFAULT NULL COMMENT '热词',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8 COMMENT='自定义词库';

-- ----------------------------
-- Records of hot_words
-- ----------------------------

-- ----------------------------
-- Table structure for `information_disclosure`
-- ----------------------------
DROP TABLE IF EXISTS `information_disclosure`;
CREATE TABLE `information_disclosure` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pollution_id` int(11) NOT NULL COMMENT '排污许可信息表外键',
  `disclosure_type` varchar(3000) DEFAULT NULL COMMENT '公开方式',
  `time_point` varchar(3000) DEFAULT NULL COMMENT '时间节点',
  `content` text COMMENT '公开内容',
  `other_info` text COMMENT '其他信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13824 DEFAULT CHARSET=utf8 COMMENT='信息公开表';

-- ----------------------------
-- Records of information_disclosure
-- ----------------------------

-- ----------------------------
-- Table structure for `investment`
-- ----------------------------
DROP TABLE IF EXISTS `investment`;
CREATE TABLE `investment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `company_name` varchar(255) DEFAULT NULL COMMENT '企业(机构)名称',
  `regist_no` varchar(100) DEFAULT NULL COMMENT '注册号',
  `company_type` varchar(100) DEFAULT NULL COMMENT '企业(机构)类型',
  `regist_amount` decimal(16,2) DEFAULT NULL COMMENT '注册资本(万元)',
  `regist_currency` varchar(20) DEFAULT NULL COMMENT '注册资本币种',
  `company_status` varchar(20) DEFAULT NULL COMMENT '企业状态',
  `cancel_time` varchar(20) DEFAULT NULL COMMENT '注销日期',
  `revoke_time` varchar(20) DEFAULT NULL COMMENT '吊销日期',
  `regist_office` varchar(100) DEFAULT NULL COMMENT '登记机关',
  `subscribe_capital` decimal(16,2) DEFAULT NULL COMMENT '认缴出资额(万元)',
  `subscribe_currency` varchar(20) DEFAULT NULL COMMENT '认缴出资币种',
  `ratio` varchar(20) DEFAULT NULL COMMENT '出资比例',
  `open_time` varchar(20) DEFAULT NULL COMMENT '开业日期',
  `legal_representative` varchar(100) DEFAULT NULL COMMENT '法定代表人姓名',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='企业投资';

-- ----------------------------
-- Records of investment
-- ----------------------------

-- ----------------------------
-- Table structure for `invite`
-- ----------------------------
DROP TABLE IF EXISTS `invite`;
CREATE TABLE `invite` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `job` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `salary` varchar(100) DEFAULT NULL COMMENT '角色简称',
  `experience` varchar(1000) DEFAULT NULL COMMENT '经验要求',
  `address` varchar(1000) DEFAULT NULL COMMENT '地点',
  `education` varchar(100) DEFAULT NULL COMMENT '学历',
  `publish_time` varchar(20) DEFAULT NULL COMMENT '发布日期',
  `source` varchar(100) DEFAULT NULL COMMENT '来源',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='招聘信息';

-- ----------------------------
-- Records of invite
-- ----------------------------

-- ----------------------------
-- Table structure for `ipe_ai_result`
-- ----------------------------
DROP TABLE IF EXISTS `ipe_ai_result`;
CREATE TABLE `ipe_ai_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '基础记录ID',
  `ipe_record_id` int(11) DEFAULT NULL,
  `file_url` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `industry_time` varchar(50) DEFAULT NULL COMMENT '监管时间',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `key_words` varchar(1000) DEFAULT NULL COMMENT '关键词',
  `region` varchar(255) DEFAULT NULL COMMENT '地址',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=897237 DEFAULT CHARSET=utf8 COMMENT='IPEAI统计结果';

-- ----------------------------
-- Records of ipe_ai_result
-- ----------------------------

-- ----------------------------
-- Table structure for `ipe_country`
-- ----------------------------
DROP TABLE IF EXISTS `ipe_country`;
CREATE TABLE `ipe_country` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(20) DEFAULT NULL COMMENT 'code',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `parent_code` varchar(20) DEFAULT NULL COMMENT '上级code',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=528 DEFAULT CHARSET=utf8 COMMENT='IPE地域信息';

-- ----------------------------
-- Records of ipe_country
-- ----------------------------

-- ----------------------------
-- Table structure for `ipe_elasticsearch`
-- ----------------------------
DROP TABLE IF EXISTS `ipe_elasticsearch`;
CREATE TABLE `ipe_elasticsearch` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `es_id` int(11) DEFAULT NULL COMMENT 'esID即ipe_id',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` varchar(100) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(100) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`),
  KEY `ipe_es_index` (`es_id`)
) ENGINE=InnoDB AUTO_INCREMENT=848012 DEFAULT CHARSET=utf8 COMMENT='IPE写入ES记录';

-- ----------------------------
-- Records of ipe_elasticsearch
-- ----------------------------

-- ----------------------------
-- Table structure for `ipe_industry_record`
-- ----------------------------
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
  PRIMARY KEY (`id`),
  KEY `industry_index` (`regist_item_id`,`year`)
) ENGINE=InnoDB AUTO_INCREMENT=959571 DEFAULT CHARSET=utf8 COMMENT='ipe监管记录';

-- ----------------------------
-- Records of ipe_industry_record
-- ----------------------------

-- ----------------------------
-- Table structure for `ly_web_crawler_config`
-- ----------------------------
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

-- ----------------------------
-- Records of ly_web_crawler_config
-- ----------------------------

-- ----------------------------
-- Table structure for `management_record`
-- ----------------------------
DROP TABLE IF EXISTS `management_record`;
CREATE TABLE `management_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pollution_id` int(11) NOT NULL COMMENT '排污许可信息表外键',
  `facility_type` varchar(1000) DEFAULT NULL COMMENT '设施类别',
  `operate_parameter` varchar(1000) DEFAULT NULL COMMENT '操作参数',
  `content` text COMMENT '记录内容',
  `frequency` varchar(1000) DEFAULT NULL COMMENT '记录频次',
  `record_type` varchar(1000) DEFAULT NULL COMMENT '记录形式',
  `other_info` text COMMENT '其他信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93103 DEFAULT CHARSET=utf8 COMMENT='环境管理台账记录要求表';

-- ----------------------------
-- Records of management_record
-- ----------------------------

-- ----------------------------
-- Table structure for `monitor_company`
-- ----------------------------
DROP TABLE IF EXISTS `monitor_company`;
CREATE TABLE `monitor_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `monitor_sequence` int(11) DEFAULT NULL COMMENT '序号',
  `region_code` varchar(20) DEFAULT NULL COMMENT '行政区划代码',
  `legal_person_code` varchar(100) DEFAULT NULL COMMENT '法人代码',
  `company_name` varchar(100) DEFAULT NULL COMMENT '企业名称',
  `monitor_type` varchar(100) DEFAULT NULL COMMENT '监控类别',
  `province` varchar(50) DEFAULT NULL COMMENT '所属省份',
  `monitor_year` varchar(20) DEFAULT NULL COMMENT '所属年份',
  `create_tm` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113058 DEFAULT CHARSET=utf8 COMMENT='国家重点监控企业名单';

-- ----------------------------
-- Records of monitor_company
-- ----------------------------

-- ----------------------------
-- Table structure for `open_court_notice`
-- ----------------------------
DROP TABLE IF EXISTS `open_court_notice`;
CREATE TABLE `open_court_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='开庭公告';

-- ----------------------------
-- Records of open_court_notice
-- ----------------------------

-- ----------------------------
-- Table structure for `organization_item`
-- ----------------------------
DROP TABLE IF EXISTS `organization_item`;
CREATE TABLE `organization_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `organization_code` varchar(100) DEFAULT NULL COMMENT '机构代码',
  `organization_name` varchar(255) DEFAULT NULL COMMENT '机构名称',
  `organization_type` varchar(100) DEFAULT NULL COMMENT '机构类型',
  `organization_address` varchar(1000) DEFAULT NULL COMMENT '机构地址',
  `jurisdictional_agency` varchar(1000) DEFAULT NULL COMMENT '管辖机构',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='组织机构代码证信息';

-- ----------------------------
-- Records of organization_item
-- ----------------------------

-- ----------------------------
-- Table structure for `other_information`
-- ----------------------------
DROP TABLE IF EXISTS `other_information`;
CREATE TABLE `other_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pollution_id` int(11) NOT NULL COMMENT '排污许可信息表外键',
  `management_requirement` text COMMENT '其他控制及管理要求',
  `other_info` text COMMENT '其他许可的内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15312 DEFAULT CHARSET=utf8 COMMENT='其他许可内容表';

-- ----------------------------
-- Records of other_information
-- ----------------------------

-- ----------------------------
-- Table structure for `patent`
-- ----------------------------
DROP TABLE IF EXISTS `patent`;
CREATE TABLE `patent` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `apply_time` varchar(20) DEFAULT NULL COMMENT '申请日期',
  `patent_type` varchar(100) DEFAULT NULL COMMENT '类型',
  `patent_name` varchar(255) DEFAULT NULL COMMENT '名称',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='专利信息';

-- ----------------------------
-- Records of patent
-- ----------------------------

-- ----------------------------
-- Table structure for `pledge_stock_right`
-- ----------------------------
DROP TABLE IF EXISTS `pledge_stock_right`;
CREATE TABLE `pledge_stock_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `pledgee` varchar(255) DEFAULT NULL COMMENT '质权人姓名',
  `pledgee_type` varchar(100) DEFAULT NULL COMMENT '出质人类别',
  `pledge_amount` decimal(16,2) DEFAULT NULL COMMENT '出质金额',
  `record_time` varchar(20) DEFAULT NULL COMMENT '出质备案日期',
  `examined_office` varchar(255) DEFAULT NULL COMMENT '出质审批部门',
  `examined_time` varchar(20) DEFAULT NULL COMMENT '出质批准日期',
  `examined_end_time` varchar(20) DEFAULT NULL COMMENT '出质截至日期',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='股权质押信息';

-- ----------------------------
-- Records of pledge_stock_right
-- ----------------------------

-- ----------------------------
-- Table structure for `pollution_discharge_license`
-- ----------------------------
DROP TABLE IF EXISTS `pollution_discharge_license`;
CREATE TABLE `pollution_discharge_license` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69551 DEFAULT CHARSET=utf8 COMMENT='排污许可信息表';

-- ----------------------------
-- Records of pollution_discharge_license
-- ----------------------------

-- ----------------------------
-- Table structure for `qichacha_company_base`
-- ----------------------------
DROP TABLE IF EXISTS `qichacha_company_base`;
CREATE TABLE `qichacha_company_base` (
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
  PRIMARY KEY (`key_no`),
  KEY `idx_qichacha_company_base` (`name`,`credit_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_base';

-- ----------------------------
-- Records of qichacha_company_base
-- ----------------------------

-- ----------------------------
-- Table structure for `qichacha_dictionary_industry`
-- ----------------------------
DROP TABLE IF EXISTS `qichacha_dictionary_industry`;
CREATE TABLE `qichacha_dictionary_industry` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `industry` varchar(100) DEFAULT NULL COMMENT '行业',
  `subIndustry` varchar(100) DEFAULT NULL COMMENT '细分行业',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=222 DEFAULT CHARSET=utf8 COMMENT='企查查行业字典';

-- ----------------------------
-- Records of qichacha_dictionary_industry
-- ----------------------------

-- ----------------------------
-- Table structure for `qichacha_judgement`
-- ----------------------------
DROP TABLE IF EXISTS `qichacha_judgement`;
CREATE TABLE `qichacha_judgement` (
  `id` varchar(20) NOT NULL COMMENT 'row_content',
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
  KEY `idx_qichacha_judgement` (`key_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_judgement';

-- ----------------------------
-- Records of qichacha_judgement
-- ----------------------------

-- ----------------------------
-- Table structure for `qichacha_patent`
-- ----------------------------
DROP TABLE IF EXISTS `qichacha_patent`;
CREATE TABLE `qichacha_patent` (
  `id` varchar(20) NOT NULL COMMENT 'id',
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
  KEY `idx_qichacha_patent` (`key_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_patent';

-- ----------------------------
-- Records of qichacha_patent
-- ----------------------------

-- ----------------------------
-- Table structure for `qichacha_penalty`
-- ----------------------------
DROP TABLE IF EXISTS `qichacha_penalty`;
CREATE TABLE `qichacha_penalty` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `key_no` varchar(35) DEFAULT NULL COMMENT 'key_no',
  `no` varchar(100) DEFAULT NULL COMMENT '处罚编号',
  `doc_no` varchar(100) DEFAULT NULL COMMENT '文档编号',
  `penalty_type` varchar(255) DEFAULT NULL COMMENT '处罚类型',
  `office_name` varchar(255) DEFAULT NULL COMMENT '处罚机构',
  `content` text COMMENT '处罚内容',
  `public_date` varchar(25) DEFAULT NULL COMMENT '公布时间',
  `penalty_date` varchar(25) DEFAULT NULL COMMENT '处罚时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `person_name` varchar(255) DEFAULT NULL COMMENT '被处罚对象',
  `reg_no` varchar(50) DEFAULT NULL COMMENT '注册编号',
  `operator` varchar(255) DEFAULT NULL COMMENT '经营者',
  `ad_penalty_doc` text COMMENT '处罚内容',
  `ad_penalty_link` varchar(255) DEFAULT NULL COMMENT '处罚链接',
  PRIMARY KEY (`id`),
  KEY `idx_qichacha_penalty` (`key_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_penalty';

-- ----------------------------
-- Records of qichacha_penalty
-- ----------------------------

-- ----------------------------
-- Table structure for `questionnaire`
-- ----------------------------
DROP TABLE IF EXISTS `questionnaire`;
CREATE TABLE `questionnaire` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `customer_company` int(11) DEFAULT NULL COMMENT '填表人企业',
  `customer_company_other` varchar(255) DEFAULT NULL COMMENT '填表人企业(其它)',
  `country` int(11) DEFAULT NULL COMMENT '国家',
  `province` int(11) DEFAULT NULL COMMENT '省',
  `issuer_quality` int(11) DEFAULT NULL COMMENT '发行人性质',
  `Bond_type` int(11) DEFAULT NULL COMMENT '债券类型',
  `Bond_type_other` varchar(255) DEFAULT NULL COMMENT '发行债券类型(其它)',
  `issue_bonds_area` int(11) DEFAULT NULL COMMENT '发行债券场所',
  `issue_bonds_scope` int(11) DEFAULT NULL COMMENT '发行债券规模',
  `issue_bonds_scope_value` varchar(50) DEFAULT NULL COMMENT '发行债券规模(具体值)',
  `issue_bonds_records` int(11) DEFAULT NULL COMMENT '发行人近三年发行债券记录',
  `green_bonds_type` int(11) DEFAULT NULL COMMENT '发行绿债项目类型',
  `green_bonds_type_other` varchar(255) DEFAULT NULL COMMENT '发行绿债项目类型(其他)',
  `major_technique` varchar(255) DEFAULT NULL COMMENT '发行绿债拟募投项目主要技术',
  `compliance_documents` varchar(50) DEFAULT NULL COMMENT '合规文件',
  `compliance_documents_other` varchar(255) DEFAULT NULL COMMENT '合规文件（其他）',
  `compliance_project_type` int(11) DEFAULT NULL COMMENT '合规项目类型',
  `compliance_project_type_other` varchar(255) DEFAULT NULL COMMENT '合规项目类型(其他)',
  `base_project_major_technique` varchar(255) DEFAULT NULL COMMENT '专项计划的基础资产项目主要技术',
  `Awarded_compliance_documents` varchar(50) DEFAULT NULL COMMENT '基础资产项目已获得合规文件',
  `Awarded_compliance_documents_other` varchar(255) DEFAULT NULL COMMENT '基础资产项目已获得合规文件(其它)',
  `customer_name` varchar(50) DEFAULT NULL COMMENT '填表人姓名',
  `customer_mobile` varchar(50) DEFAULT NULL COMMENT '填表人电话',
  `customer_mail` varchar(50) DEFAULT NULL COMMENT '填表人邮箱',
  `customer_wechart` varchar(50) DEFAULT NULL COMMENT '填表人微信',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='问卷调查';

-- ----------------------------
-- Records of questionnaire
-- ----------------------------

-- ----------------------------
-- Table structure for `regist_item`
-- ----------------------------
DROP TABLE IF EXISTS `regist_item`;
CREATE TABLE `regist_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '企业名称',
  `legal_representative` varchar(100) DEFAULT NULL COMMENT '法人代表姓名',
  `regist_number` varchar(100) DEFAULT NULL COMMENT '注册号',
  `old_regist_number` varchar(100) DEFAULT NULL COMMENT '原注册号',
  `registered_capital` decimal(16,2) DEFAULT NULL COMMENT '注册资本(万元)',
  `paid_in_capital` decimal(16,2) DEFAULT NULL COMMENT '实收资本 (万元)',
  `currency` varchar(20) DEFAULT NULL COMMENT '币种',
  `company_type` varchar(100) DEFAULT NULL COMMENT '企业(机构)类型',
  `operate_state` varchar(100) DEFAULT NULL COMMENT '经营状态',
  `start_time` varchar(20) DEFAULT NULL COMMENT '经营期限 自',
  `end_time` varchar(20) DEFAULT NULL COMMENT '经营期限 至',
  `open_time` varchar(20) DEFAULT NULL COMMENT '开业日期',
  `cancel_time` varchar(20) DEFAULT NULL COMMENT '注销日期',
  `revoke_time` varchar(20) DEFAULT NULL COMMENT '吊销日期',
  `regist_office` varchar(100) DEFAULT NULL COMMENT '登记机关',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `annual_year` varchar(20) DEFAULT NULL COMMENT '最后年检年度',
  `annual_day` varchar(20) DEFAULT NULL COMMENT '最后年检日期',
  `trade_code` varchar(100) DEFAULT NULL COMMENT '行业门类代码',
  `trade_name` varchar(100) DEFAULT NULL COMMENT '行业门类名称',
  `country_trade_code` varchar(100) DEFAULT NULL COMMENT '国民经济行业代码',
  `country_trade_name` varchar(100) DEFAULT NULL COMMENT '国民经济行业名称',
  `permission` varchar(100) DEFAULT NULL COMMENT '许可经营项目',
  `general` varchar(1000) DEFAULT NULL COMMENT '一般经营项目',
  `business_scope` varchar(1000) DEFAULT NULL COMMENT '经营(业务)范围',
  `business_way` varchar(1000) DEFAULT NULL COMMENT '经营(业务)范围及方式',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `data_source` int(11) DEFAULT NULL COMMENT '数据来源，1手工录入，2excel导入，3网络爬虫',
  `company_id` int(11) DEFAULT NULL COMMENT '公司在IPE的companyId',
  `group_company_public` varchar(10) DEFAULT NULL COMMENT '集团公司是否上市',
  `group_company_name` varchar(255) DEFAULT NULL COMMENT '集团公司名称',
  `group_company_exchange_name` varchar(20) DEFAULT NULL COMMENT '集团公司交易所名称',
  `group_company_stock_code` varchar(20) DEFAULT NULL COMMENT '集团公司上市代码',
  `sewage_facility` varchar(20) DEFAULT NULL COMMENT '是否有污水处理设施',
  `process_gas_facility` varchar(20) DEFAULT NULL COMMENT '是否有工业废气处理设施',
  `boiler_gas_facility` varchar(20) DEFAULT NULL COMMENT '是否有锅炉废气处理设施',
  `industrial_sewage_discharge` varchar(100) DEFAULT NULL COMMENT '工业污水去向',
  `life_sweage_discharge` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '生活污水去向',
  `industrial_sewage_emission_standard` varchar(100) DEFAULT NULL COMMENT '工业污水排放标准',
  `life_sweage_emission_standard` varchar(100) DEFAULT NULL COMMENT '生活污水排放标准',
  `gas_emission_standard` varchar(100) DEFAULT NULL COMMENT '废气执行排放标准',
  `pollutant_source` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '污染源类型',
  `main_production` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '生产经营主要产品',
  `pollutant_desc` varchar(200) DEFAULT NULL COMMENT '企业排污情况自述',
  PRIMARY KEY (`id`),
  KEY `regist_item_index` (`company_name`,`address`)
) ENGINE=InnoDB AUTO_INCREMENT=1555554 DEFAULT CHARSET=utf8 COMMENT='登记信息';

-- ----------------------------
-- Records of regist_item
-- ----------------------------

-- ----------------------------
-- Table structure for `regist_item_location`
-- ----------------------------
DROP TABLE IF EXISTS `regist_item_location`;
CREATE TABLE `regist_item_location` (
  `id` int(11) NOT NULL COMMENT 'id',
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `district` varchar(20) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `number` varchar(20) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Index_province_city` (`province`,`city`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区域信息表';

-- ----------------------------
-- Records of regist_item_location
-- ----------------------------

-- ----------------------------
-- Table structure for `relation_company`
-- ----------------------------
DROP TABLE IF EXISTS `relation_company`;
CREATE TABLE `relation_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `employee_id` int(11) DEFAULT NULL COMMENT '主要人员信息ID',
  `company_name` varchar(255) DEFAULT NULL COMMENT '企业名称',
  `job` varchar(255) DEFAULT NULL COMMENT '任职',
  `investment` decimal(16,2) DEFAULT NULL COMMENT '投资（万元）',
  `ratio` varchar(20) DEFAULT NULL COMMENT '持股比例',
  `regist_amount` decimal(16,2) DEFAULT NULL COMMENT '注册资本（万元）',
  `regist_currency` varchar(20) DEFAULT NULL COMMENT '注册资本币种',
  `company_type` varchar(255) DEFAULT NULL COMMENT '企业（机构）类型',
  `regist_no` varchar(100) DEFAULT NULL COMMENT '注册号',
  `regist_office` varchar(255) DEFAULT NULL COMMENT '登记机关',
  `company_status` varchar(100) DEFAULT NULL COMMENT '企业状态',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='关联企业';

-- ----------------------------
-- Records of relation_company
-- ----------------------------

-- ----------------------------
-- Table structure for `shareholder`
-- ----------------------------
DROP TABLE IF EXISTS `shareholder`;
CREATE TABLE `shareholder` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `shareholder_name` varchar(100) DEFAULT NULL COMMENT '股东名称',
  `capital` decimal(16,2) DEFAULT NULL COMMENT '认缴出资额(万元)',
  `currency` varchar(20) DEFAULT NULL COMMENT '币种',
  `ratio` varchar(20) DEFAULT NULL COMMENT '出资比例',
  `contributive_time` varchar(20) DEFAULT NULL COMMENT '出资日期',
  `nationality` varchar(100) DEFAULT NULL COMMENT '国籍',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='股东及出资信息';

-- ----------------------------
-- Records of shareholder
-- ----------------------------

-- ----------------------------
-- Table structure for `software_copyright`
-- ----------------------------
DROP TABLE IF EXISTS `software_copyright`;
CREATE TABLE `software_copyright` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `software_name` varchar(255) DEFAULT NULL COMMENT '软件名称',
  `software_shop_name` varchar(100) DEFAULT NULL COMMENT '软件简称',
  `regist_no` varchar(100) DEFAULT NULL COMMENT '登记号',
  `software_version` varchar(100) DEFAULT NULL COMMENT '版本号',
  `classify_no` varchar(100) DEFAULT NULL COMMENT '分类号',
  `approve_regist_time` varchar(20) DEFAULT NULL COMMENT '登记批准日期',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='软件著作权信息';

-- ----------------------------
-- Records of software_copyright
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dictionary`;
CREATE TABLE `sys_dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `dic_name` varchar(100) DEFAULT NULL COMMENT 'name',
  `dic_parent_id` int(11) DEFAULT NULL COMMENT 'parent',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8 COMMENT='数据字典';

-- ----------------------------
-- Records of sys_dictionary
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `url` varchar(100) DEFAULT NULL COMMENT '菜单链接',
  `parent_id` int(11) DEFAULT NULL COMMENT '上级菜单序号',
  `order_num` int(11) DEFAULT NULL COMMENT '排序号',
  `close_icon` varchar(100) DEFAULT NULL COMMENT '折叠时图标',
  `open_icon` varchar(100) DEFAULT NULL COMMENT '展开时图标',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '系统管理', null, '0', '1', 'images/leftico01.png', 'images/leftico01.png', '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('2', '用户管理', '../sys/toSysUserList.do', '1', '1', '', null, '1', null, null, null, '0000-00-00', '');
INSERT INTO `sys_menu` VALUES ('3', '角色管理', '../sys/toSysRoleList.do', '1', '2', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('4', '数据管理', null, '0', '2', 'images/leftico01.png', 'images/leftico01.png', '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('5', '基础数据管理', '../basicInfo/toRegistItemList.do', '4', '1', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('6', '人工审核', '../basicInfo/toAuditList.do', '4', '2', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('7', '爬取数据', '../basicInfo/toReptileList.do', '4', '3', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('8', '导入数据', '../basicInfo/toImportList.do', '4', '4', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('9', '字典管理', '../sys/toSysDictionaryList.do', '1', '3', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('10', '问卷调查', '../basicInfo/toQuestionnaireList.do', '4', '5', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('11', '环保部爬虫数据', '../basicInfo/toMepData.do', '4', '6', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('12', '监管记录', '../ipe/toIndustry.do', '4', '7', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('13', '环境云API', '../basicInfo/toEnviApi.do', '4', '8', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('14', '空气质量记录', '../basicInfo/toAirQuality.do', '4', '9', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('15', '排污许可信息', '../basicInfo/toPollutionLicense.do', '4', '10', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('16', 'enrobot引擎', null, '0', '3', 'images/leftico01.png', 'images/leftico01.png', '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('17', '热词管理', '../hotWorld/toHotWorldList.do', '16', '1', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('18', '停用词管理', '../stopWorld/toStopWorldList.do', '16', '2', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('19', '监管信息查询', '../ipesearch/toIpeSearchList.do', '16', '3', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('20', '词频统计', '../wordfrequency/toWordFrequencyList.do', '16', '4', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('21', 'qichacha', '../companybase/toCompanyBaseList.do', '4', '11', 'images/leftico01.png', 'images/leftico01.png', '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('22', '爬虫配置', '../crawler/listPage.do', '4', '12', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('23', '爬虫结果', '../crawler/resultListPage.do', '4', '13', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('24', '合规网爬虫', '../csrare/resultListPage.do', '4', '14', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('25', 'EXCEL数据', null, '0', '1', 'images/leftico01.png', 'images/leftico01.png', '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('26', '能效标识备案', '../excelEnergyEfficiencyLabel/toExcelEnergyEfficiencyLabelList.do', '25', '1', '', null, '1', null, null, null, '2018-05-10', '');
INSERT INTO `sys_menu` VALUES ('27', '环境污染责任保险', '../environmentalPollutionLiabilityInsurance/toHtml.do', '25', '1', '', null, '1', null, null, null, '2018-05-11', '');
INSERT INTO `sys_menu` VALUES ('28', '节能服务公司信用评级', '../energyLevel/toHtml.do', '25', '1', '', null, '1', null, null, null, '2018-05-12', '');
INSERT INTO `sys_menu` VALUES ('29', '备案信息', '../energyExcellenceCase/toHtml.do', '25', '1', '', null, '1', null, null, null, '2018-05-17', '');
INSERT INTO `sys_menu` VALUES ('30', 'Ai数据', '../aiIpe/toAiPage.do', '4', '15', null, null, '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('31', '查询配置', '../companyQuery/toQueryConfigList.do', '16', '4', null, null, '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_nation`
-- ----------------------------
DROP TABLE IF EXISTS `sys_nation`;
CREATE TABLE `sys_nation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(40) DEFAULT NULL COMMENT '地区代码',
  `province` varchar(40) DEFAULT NULL COMMENT '省份',
  `city` varchar(40) DEFAULT NULL COMMENT '城市',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父级行政区划ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `district` varchar(40) DEFAULT NULL COMMENT '县/区',
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `operator` bigint(20) DEFAULT NULL COMMENT '操作人',
  `operator_ip` varchar(25) DEFAULT NULL COMMENT '操作人IP',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3924 DEFAULT CHARSET=utf8 COMMENT='国家行政区划表';

-- ----------------------------
-- Records of sys_nation
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `short_name` varchar(100) DEFAULT NULL COMMENT '角色简称',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '系统管理员', '管理员', '1', null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('2', 'stu', 'stu', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_role` VALUES ('3', '合规', '合规', '1', '2', '2018-04-27', null, null, null);

-- ----------------------------
-- Table structure for `sys_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单ID',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=525 DEFAULT CHARSET=utf8 COMMENT='权限表,菜单角色关系';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('111', '2', '4', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('112', '2', '11', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('113', '2', '12', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('114', '2', '15', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('244', '3', '4', '1', '2', '2018-04-27', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('245', '3', '24', '1', '2', '2018-04-27', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('495', '1', '1', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('496', '1', '2', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('497', '1', '3', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('498', '1', '25', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('499', '1', '26', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('500', '1', '27', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('501', '1', '28', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('502', '1', '29', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('503', '1', '4', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('504', '1', '5', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('505', '1', '6', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('506', '1', '7', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('507', '1', '8', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('508', '1', '10', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('509', '1', '11', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('510', '1', '12', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('511', '1', '13', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('512', '1', '14', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('513', '1', '15', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('514', '1', '21', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('515', '1', '22', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('516', '1', '23', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('517', '1', '24', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('518', '1', '30', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('519', '1', '16', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('520', '1', '17', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('521', '1', '18', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('522', '1', '19', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('523', '1', '20', '1', '2', '2018-08-12', null, null, null);
INSERT INTO `sys_role_menu` VALUES ('524', '1', '31', '1', '2', '2018-08-12', null, null, null);

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_account` varchar(100) DEFAULT NULL COMMENT '用户账号',
  `user_password` varchar(100) DEFAULT NULL COMMENT '用户密码',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名称',
  `email` varchar(100) DEFAULT NULL COMMENT '用户邮箱',
  `mobile` varchar(50) DEFAULT NULL COMMENT '用户电话',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('2', 'admin', '4a697a9f0c0c9f395c8f98e2de260954', 'admin', '', '', '1', null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('3', 'test', 'e10adc3949ba59abbe56e057f20f883e', 'test', 'test@igreenbank.com', '12345678912', '1', '2', '2017-05-18', null, null, null);
INSERT INTO `sys_user` VALUES ('4', 'haisong', 'e10adc3949ba59abbe56e057f20f883e', '录入测试', '88364511@qq.com', '18001096136', '1', '2', '2017-08-28', null, null, null);
INSERT INTO `sys_user` VALUES ('5', 'liao', 'e10adc3949ba59abbe56e057f20f883e', '廖', '', '', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_user` VALUES ('6', 'hegui', '6da3036d944e6e5f7429595bdc2bca00', 'hegui', '', '', '1', '2', '2018-04-27', null, null, null);

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '2', '1', '2', '2017-04-15', null, null, null);
INSERT INTO `sys_user_role` VALUES ('2', '2', '5', '1', '2', '2017-12-06', null, null, null);
INSERT INTO `sys_user_role` VALUES ('3', '3', '6', '1', '2', '2018-04-27', null, null, null);

-- ----------------------------
-- Table structure for `thing_chattel_mortgage`
-- ----------------------------
DROP TABLE IF EXISTS `thing_chattel_mortgage`;
CREATE TABLE `thing_chattel_mortgage` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `mortgage_id` varchar(100) DEFAULT NULL COMMENT '抵押ID',
  `thing_name` varchar(255) DEFAULT NULL COMMENT '抵押物名称',
  `thing_num` int(11) DEFAULT NULL COMMENT '数量',
  `thing_amount` decimal(16,2) DEFAULT NULL COMMENT '价值(万元)',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='动产抵押物信息';

-- ----------------------------
-- Records of thing_chattel_mortgage
-- ----------------------------

-- ----------------------------
-- Table structure for `tmp_address`
-- ----------------------------
DROP TABLE IF EXISTS `tmp_address`;
CREATE TABLE `tmp_address` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(500) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tmp_address
-- ----------------------------

-- ----------------------------
-- Table structure for `tmp_qichacha_company_base`
-- ----------------------------
DROP TABLE IF EXISTS `tmp_qichacha_company_base`;
CREATE TABLE `tmp_qichacha_company_base` (
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
  PRIMARY KEY (`key_no`),
  KEY `idx_qichacha_company_base` (`name`,`credit_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_base';

-- ----------------------------
-- Records of tmp_qichacha_company_base
-- ----------------------------

-- ----------------------------
-- Table structure for `tmp_qichacha_judgement`
-- ----------------------------
DROP TABLE IF EXISTS `tmp_qichacha_judgement`;
CREATE TABLE `tmp_qichacha_judgement` (
  `id` varchar(20) NOT NULL COMMENT 'row_content',
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
  KEY `idx_qichacha_judgement` (`key_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_judgement';

-- ----------------------------
-- Records of tmp_qichacha_judgement
-- ----------------------------

-- ----------------------------
-- Table structure for `tmp_qichacha_patent`
-- ----------------------------
DROP TABLE IF EXISTS `tmp_qichacha_patent`;
CREATE TABLE `tmp_qichacha_patent` (
  `id` varchar(20) NOT NULL COMMENT 'id',
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
  KEY `idx_qichacha_patent` (`key_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_patent';

-- ----------------------------
-- Records of tmp_qichacha_patent
-- ----------------------------

-- ----------------------------
-- Table structure for `tmp_qichacha_penalty`
-- ----------------------------
DROP TABLE IF EXISTS `tmp_qichacha_penalty`;
CREATE TABLE `tmp_qichacha_penalty` (
  `id` varchar(20) NOT NULL COMMENT 'ID',
  `key_no` varchar(35) DEFAULT NULL COMMENT 'key_no',
  `no` varchar(100) DEFAULT NULL COMMENT '处罚编号',
  `doc_no` varchar(100) DEFAULT NULL COMMENT '文档编号',
  `penalty_type` varchar(255) DEFAULT NULL COMMENT '处罚类型',
  `office_name` varchar(255) DEFAULT NULL COMMENT '处罚机构',
  `content` text COMMENT '处罚内容',
  `public_date` varchar(25) DEFAULT NULL COMMENT '公布时间',
  `penalty_date` varchar(25) DEFAULT NULL COMMENT '处罚时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `person_name` varchar(255) DEFAULT NULL COMMENT '被处罚对象',
  `reg_no` varchar(50) DEFAULT NULL COMMENT '注册编号',
  `operator` varchar(255) DEFAULT NULL COMMENT '经营者',
  `ad_penalty_doc` text COMMENT '处罚内容',
  `ad_penalty_link` varchar(255) DEFAULT NULL COMMENT '处罚链接',
  PRIMARY KEY (`id`),
  KEY `idx_qichacha_penalty` (`key_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='qichacha_penalty';

-- ----------------------------
-- Records of tmp_qichacha_penalty
-- ----------------------------

-- ----------------------------
-- Table structure for `web_crawler_config`
-- ----------------------------
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
  `city` varchar(50) DEFAULT NULL COMMENT '网站地区',
  `area` varchar(50) DEFAULT NULL COMMENT '网站区域',
  `source_type` varchar(50) DEFAULT NULL COMMENT '来源类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='网站抓取配置表';

-- ----------------------------
-- Records of web_crawler_config
-- ----------------------------

-- ----------------------------
-- Table structure for `web_crawler_result`
-- ----------------------------
DROP TABLE IF EXISTS `web_crawler_result`;
CREATE TABLE `web_crawler_result` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(100) DEFAULT NULL COMMENT '网站名称',
  `web_domain` varchar(50) DEFAULT NULL COMMENT '网站域名',
  `web_detail_name` varchar(500) DEFAULT NULL COMMENT '详情标题',
  `web_detail_url` varchar(500) DEFAULT NULL COMMENT '详情页原url',
  `web_detail_result_url` varchar(500) DEFAULT NULL COMMENT '抓取详情页url',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '配置时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `save_path` varchar(500) DEFAULT NULL,
  `search_name` varchar(100) DEFAULT NULL,
  `search_id` bigint(11) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL COMMENT '网站地区',
  `area` varchar(50) DEFAULT NULL COMMENT '网站区域',
  `source_type` varchar(50) DEFAULT NULL COMMENT '来源类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89812 DEFAULT CHARSET=utf8 COMMENT='网站抓取结果';

-- ----------------------------
-- Records of web_crawler_result
-- ----------------------------

-- ----------------------------
-- Table structure for `web_csrare_dictionary_application_domain`
-- ----------------------------
DROP TABLE IF EXISTS `web_csrare_dictionary_application_domain`;
CREATE TABLE `web_csrare_dictionary_application_domain` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `application_domain` varchar(100) DEFAULT NULL COMMENT '使用领域',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 COMMENT='使用领域字典';

-- ----------------------------
-- Records of web_csrare_dictionary_application_domain
-- ----------------------------

-- ----------------------------
-- Table structure for `web_csrare_result`
-- ----------------------------
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
  `effect_date` date DEFAULT NULL COMMENT '生效日期',
  `publish_date` date DEFAULT NULL COMMENT '颁布日期',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '配置时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '配置更新时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `save_path` varchar(100) DEFAULT NULL COMMENT '保存地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32537 DEFAULT CHARSET=utf8 COMMENT='law网站抓取结果';

-- ----------------------------
-- Records of web_csrare_result
-- ----------------------------

-- ----------------------------
-- Table structure for `word_frequency`
-- ----------------------------
DROP TABLE IF EXISTS `word_frequency`;
CREATE TABLE `word_frequency` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `word` varchar(255) DEFAULT NULL COMMENT '热词',
  `times` int(11) DEFAULT NULL COMMENT '出现次数',
  `statas` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`),
  KEY `word_index` (`times`)
) ENGINE=InnoDB AUTO_INCREMENT=1869 DEFAULT CHARSET=utf8 COMMENT='词频';

-- ----------------------------
-- Records of word_frequency
-- ----------------------------

-- ----------------------------
-- Table structure for `written_judgement`
-- ----------------------------
DROP TABLE IF EXISTS `written_judgement`;
CREATE TABLE `written_judgement` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `regist_item_id` int(11) DEFAULT NULL COMMENT '登记信息ID',
  `case_time` varchar(20) DEFAULT NULL COMMENT '时间',
  `case_type` varchar(20) DEFAULT NULL COMMENT '案件类型',
  `case_title` varchar(255) DEFAULT NULL COMMENT '标题',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `creater` int(11) DEFAULT NULL COMMENT '创建者',
  `created_time` date DEFAULT NULL COMMENT '创建时间',
  `updater` int(11) DEFAULT NULL COMMENT '更新者',
  `updated_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='裁判文书信息';

-- ----------------------------
-- Records of written_judgement
-- ----------------------------
