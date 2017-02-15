package com.yc.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.yc.mybatis.MybatisHelper;

public class TestMyBatis {
	
	private  MybatisHelper mh = new MybatisHelper();

	@Test
	public void getSession() {
		SqlSessionFactory sessionFactory = mh.getFactory();
		System.out.println(sessionFactory);
		
		SqlSession sqlSession = sessionFactory.openSession();
		System.out.println(sqlSession);
		
		
	}
	@Test
	public void find() {
		mh.find();
	}
	@Test
	public void insert() {
		mh.insert();
	}
	@Test
	public void delete() {
		mh.delete();
	}
	@Test
	public void update() {
		mh.update();
	}

}
