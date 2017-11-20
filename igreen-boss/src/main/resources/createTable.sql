/*环保部清洁生产企业表*/
CREATE TABLE clean_production_company (
   id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
   regist_item_id int(11) DEFAULT NULL COMMENT '登记企业主键',
   check_year varchar(10) DEFAULT NULL COMMENT '年份',
   batch_no varchar(10) DEFAULT NULL COMMENT '批次',
   city varchar(20) DEFAULT NULL COMMENT '城市',
   serial_number varchar(100) DEFAULT NULL COMMENT '编号',
   company_name varchar(255) DEFAULT NULL COMMENT '公司名称',
   trade varchar(100) DEFAULT NULL COMMENT '行业',
   product_sales_amount varchar(500) DEFAULT NULL COMMENT '主要产品及年产量',
   region varchar(100) DEFAULT NULL COMMENT '所属地区',
   address varchar(200) DEFAULT NULL COMMENT '地址',
   report_time varchar(20) DEFAULT NULL COMMENT '公布时间',
   submit_check_time varchar(20) DEFAULT NULL COMMENT '提交审核时间',
   complete_estimate_time varchar(20) DEFAULT NULL COMMENT '完成评估时间',
   complete_check_time varchar(20) DEFAULT NULL COMMENT '完成验收时间',
   check_organization varchar(200) DEFAULT NULL COMMENT '审核咨询机构名称',
   create_tm  timestamp NULL DEFAULT NULL,
   PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环保部清洁生产企业';

/*国家重点监管企业表*/
CREATE TABLE monitor_company (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  regist_item_id int(11) DEFAULT NULL COMMENT '登记信息ID',
  monitor_sequence int(11) DEFAULT NULL COMMENT '序号',
  region_code varchar(20) DEFAULT NULL COMMENT '行政区划代码',
  legal_person_code varchar(100) DEFAULT NULL COMMENT '法人代码',
  company_name varchar(100) DEFAULT NULL COMMENT '企业名称',
  monitor_type varchar(100) DEFAULT NULL COMMENT '监控类别',
  province varchar(50) DEFAULT NULL COMMENT '所属省份',
  monitor_year varchar(20) DEFAULT NULL COMMENT '所属年份',
  create_tm timestamp NULL DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家重点监控企业名单';

/*群众举报案件表*/
CREATE TABLE environmental_protection_report_issue (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  regist_item_id int(11) DEFAULT NULL COMMENT '登记信息ID',
  report_sequence int(11) DEFAULT NULL COMMENT '序号',
  report_year varchar(20) DEFAULT NULL COMMENT '年份',
  report_month varchar(20) DEFAULT NULL COMMENT '月份',
  province varchar(50) DEFAULT NULL COMMENT '省份',
  company_name varchar(100) DEFAULT NULL COMMENT '涉及企业',
  report_issue varchar(200) DEFAULT NULL COMMENT '存在问题',
  deal_result varchar(1000) DEFAULT NULL COMMENT '处理情况',
  report_comment varchar(20) DEFAULT NULL COMMENT '备注',
  create_tm timestamp NULL DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环保举报热线群众举报案件情况';

/*环境云城市编码表*/
CREATE TABLE envicloud_city_code (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  area_id varchar(32) DEFAULT NULL COMMENT '编码',
  name_en varchar(32) DEFAULT NULL COMMENT '城市名称-英文',
  name_cn varchar(32) DEFAULT NULL COMMENT '城市名称-中文',
  district_en varchar(32) DEFAULT NULL COMMENT '行政区-英文',
  district_cn varchar(32) DEFAULT NULL COMMENT '行政区-中文',
  prov_en varchar(32) DEFAULT NULL COMMENT '国家-英文',
  prov_cn varchar(32) DEFAULT NULL COMMENT '国家-中文',
  nation_en varchar(32) DEFAULT NULL COMMENT '国家-英文',
  nation_cn varchar(32) DEFAULT NULL COMMENT '国家-中文',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境云城市编码表';

create table ipe_industry_record
(
   id                   int not null auto_increment comment 'id',
   regist_item_id       int comment '登记信息ID',
   year                 varchar(10) comment '年度',
   title                varchar(1000) comment '标题',
   ipe_id               bigint comment 'ipe记录ID',
   file_name            varchar(100) comment '文件名称',
   status               int comment '状态',
   creater              int comment '创建者',
   created_time         date comment '创建时间',
   updater              int comment '更新者',
   updated_time         date comment '更新时间',
   remark               varchar(255) comment '备注',
   primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ipe监管记录';

/*环保部空气质量*/
CREATE TABLE air_quality (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  record_date date DEFAULT NULL COMMENT '日期',
  city varchar(32) DEFAULT NULL COMMENT '城市',
  air_quality_index varchar(32) DEFAULT NULL COMMENT 'AQI指数',
  main_pollutant varchar(32) DEFAULT NULL COMMENT '首要污染物',
  status varchar(16) DEFAULT NULL COMMENT '空气质量级别',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环保部空气质量表';

/*排污许可信息*/
CREATE TABLE pollution_discharge_license (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  regist_item_id int(11) DEFAULT NULL COMMENT '登记信息ID',
  province varchar(16) DEFAULT NULL COMMENT '省',
  city varchar(32) DEFAULT NULL COMMENT '城市',
  license_number varchar(32) DEFAULT NULL COMMENT '许可证编号',
  company_name varchar(32) DEFAULT NULL COMMENT '公司名称',
  industry varchar(16) DEFAULT NULL COMMENT '行业类别',
  valid_date varchar(100) DEFAULT NULL COMMENT '许可证有效日期',
  start_valid_date date DEFAULT NULL COMMENT '许可证有效起始日期',
  end_valid_date date DEFAULT NULL COMMENT '许可证有效终止日期',
  certification_date date DEFAULT NULL COMMENT '发证日期',
  data_id varchar(100) DEFAULT NULL COMMENT '排污详情数据ID，爬虫用',
  address varchar(100) DEFAULT NULL COMMENT '公司地址',
  certificate_organization varchar(100) DEFAULT NULL COMMENT '发证机关',
  pollution_type varchar(1000) DEFAULT NULL COMMENT '主要污染类别',
  air_pollution_type varchar(1000) DEFAULT NULL COMMENT '大气主要污染物种类',
  air_pollution_discharge_rule varchar(1000) DEFAULT NULL COMMENT '大气污染物排放规律',
  air_pollution_discharge_standard varchar(1000) DEFAULT NULL COMMENT '大气污染物排放执行标准',
  water_pollution_type varchar(1000) DEFAULT NULL COMMENT '废水主要污染物种类',
  water_pollution_discharge_rule varchar(1000) DEFAULT NULL COMMENT '废水污染物排放规律',
  water_pollution_discharge_standard varchar(1000) DEFAULT NULL COMMENT '废水污染物排放执行标准',
  pollution_trade varchar(1000) DEFAULT NULL COMMENT '排污权使用和交易信息',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='排污许可信息表';

/*执行报告*/
CREATE TABLE execution_record (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  pollution_id int(11) NOT NULL COMMENT '排污许可信息表外键',
  content text DEFAULT NULL COMMENT '主要内容',
  frequency varchar(1000) DEFAULT NULL COMMENT '上报频次',
  other_info text DEFAULT NULL COMMENT '其他信息',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='执行（守法）报告表';

/*信息公开*/
CREATE TABLE information_disclosure (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  pollution_id int(11) NOT NULL COMMENT '排污许可信息表外键',
  disclosure_type varchar(3000) DEFAULT NULL COMMENT '公开方式',
  time_point varchar(3000) DEFAULT NULL COMMENT '时间节点',
  content text DEFAULT NULL COMMENT '公开内容',
  other_info text DEFAULT NULL COMMENT '其他信息',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='信息公开表';

/*环境管理台账记录要求*/
CREATE TABLE management_record (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  pollution_id int(11) NOT NULL COMMENT '排污许可信息表外键',
  facility_type varchar(1000) DEFAULT NULL COMMENT '设施类别',
  operate_parameter varchar(1000) DEFAULT NULL COMMENT '操作参数',
  content text DEFAULT NULL COMMENT '记录内容',
  frequency varchar(1000) DEFAULT NULL COMMENT '记录频次',
  record_type varchar(1000) DEFAULT NULL COMMENT '记录形式',
  other_info text DEFAULT NULL COMMENT '其他信息',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境管理台账记录要求表';

/*其他许可内容*/
CREATE TABLE other_information (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  pollution_id int(11) NOT NULL COMMENT '排污许可信息表外键',
  management_requirement TEXT DEFAULT NULL COMMENT '其他控制及管理要求',
  other_info text DEFAULT NULL COMMENT '其他许可的内容',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='其他许可内容表';