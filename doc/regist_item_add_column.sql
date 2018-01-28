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
