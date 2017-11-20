package com.igreen.boss.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igreen.common.dao.SysRoleMapper;
import com.igreen.common.model.SysRole;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class SysRoleMapperTest {

	@Resource
	SysRoleMapper roleMapper;
	
	@Test
	public void getUserRoleTest(){
		List<SysRole> list = roleMapper.getUserRole(1);
		System.out.println(list.toString());
	}
}
