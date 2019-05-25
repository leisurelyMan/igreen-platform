package com.igreen.boss.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igreen.common.dao.SysMenuMapper;
import com.igreen.common.model.SysMenu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring.xml","classpath:spring-mybatis.xml"})
public class SysMenuMapperTest {

	@Autowired
	SysMenuMapper mapper;
	
/*	@Test
	public void insertTest(){
		SysMenu menu = new SysMenu();
		menu.setName("test");
		mapper.insertSelective(menu);
		System.out.println(menu.getId());
	}*/
	
	@Test
	public void selectAllTest(){
		List<SysMenu> menus = mapper.selectAll();
		System.out.println(menus.toString());
	}
	
	@Test
	public void selectMenuIdByRoleIdTest(){
		List<SysMenu> list = mapper.selectMenuIdByRoleId(1);
		System.out.println(list);
	}
}
