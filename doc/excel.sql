CREATE TABLE `qichacha_dictionary_industry` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `industry` varchar(100) DEFAULT NULL COMMENT '行业',
  `subIndustry` varchar(100) DEFAULT NULL COMMENT '细分行业',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='企查查行业字典';

CREATE TABLE `web_csrare_dictionary_application_domain` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `application_domain` varchar(100) DEFAULT NULL COMMENT '使用领域',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='使用领域字典';

INSERT INTO sys_menu VALUES (25, 'EXCEL数据', null, '0', '1', 'images/leftico01.png', 'images/leftico01.png', '1', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES (26, '能效标识备案', '../excelEnergyEfficiencyLabel/toExcelEnergyEfficiencyLabelList.do', 25, '1', '', null, '1', null, null, null, SYSDATE(), '');
INSERT INTO `sys_menu` VALUES (27, '环境污染责任保险', '../environmentalPollutionLiabilityInsurance/toHtml.do', 25, '1', '', null, '1', null, null, null, SYSDATE(), '');
INSERT INTO `sys_menu` VALUES (28, '节能服务公司信用评级', '../energyLevel/toHtml.do', 25, '1', '', null, '1', null, null, null, SYSDATE(), '');
INSERT INTO `sys_menu` VALUES (29, '备案信息', '../energyExcellenceCase/toHtml.do', 25, '1', '', null, '1', null, null, null, SYSDATE(), '');



CREATE TABLE excel_environmental_pollution_liability_insurance (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  province_name varchar(100) DEFAULT NULL COMMENT '省份',
  company_name varchar(255) DEFAULT NULL COMMENT '备案单位',
  year varchar(10) DEFAULT NULL COMMENT '年份',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='环境污染责任保险';