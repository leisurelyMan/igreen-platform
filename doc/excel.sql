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