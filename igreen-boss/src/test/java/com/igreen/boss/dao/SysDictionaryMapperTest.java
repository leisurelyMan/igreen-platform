package com.igreen.boss.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igreen.common.dao.SysDictionaryMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class SysDictionaryMapperTest {

	@Resource
	SysDictionaryMapper mapper;
	
	@Test
	public void selectByPrentIdTest(){
		mapper.selectByPrentId(null);
	}
}
