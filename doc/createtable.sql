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