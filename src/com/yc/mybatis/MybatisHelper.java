package com.yc.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yc.bean.Users;


public class MybatisHelper {
	
	private SqlSessionFactory sqlSessionFactory = getFactory();
    //通过session工厂得到一个session
    private SqlSession session = sqlSessionFactory.openSession();
	
//    public static void main(String[] args) {
//        MybatisHelper mh = new MybatisHelper();
//        //mh.find();
//        //mh.delete();
//        //mh.update();
//        mh.insert();
//    }
    
    public SqlSessionFactory getFactory(){
        String config = "mybatis-config.xml";
        //流的操作（读取）
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //使用了xml的解析，解析出mybatis-config.xml中的 数据库的配置项，创建数据连接池
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    public void find(){
        
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Users u = session.selectOne("com.yc.dao.mapper.UsersMapper.selectUser", 2);
            System.out.println(u);
        } finally {
        session.close();
        }
    }
    public void delete(){
//        SqlSessionFactory sqlSessionFactory = getFactory();
//        //通过session工厂得到一个session
//        SqlSession session = sqlSessionFactory.openSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Users u  = new Users(7,"zahngds","a");
            int  num = session.delete("com.yc.dao.mapper.UsersMapper.deleteUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
    public void update(){
//        SqlSessionFactory sqlSessionFactory = getFactory();
//        //通过session工厂得到一个session
//        SqlSession session = sqlSessionFactory.openSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Users u  = new Users(4,"hahahha","aaa");
            int  num = session.update("com.yc.dao.mapper.UsersMapper.updateUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
    public void insert(){
//        SqlSessionFactory sqlSessionFactory = getFactory();
//        //通过session工厂得到一个session
//        SqlSession session = sqlSessionFactory.openSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Users u  = new Users(5,"zahngds","a");
            int  num = session.insert("com.yc.dao.mapper.UsersMapper.insertUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
}
