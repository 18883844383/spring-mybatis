package com.tarena.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.tarena.dao.MyBatisEmpDao;
import com.tarena.dao.MyBatisUtil;
import com.tarena.dao.UserDao;
import com.tarena.entity.User;

public class TestCase {

	/**
     * MyBatisEmpDao.findAll()
     */
	@Test
    public void test8() {
		String cfg = "applicationContext.xml";
        ApplicationContext ctx = 
            new ClassPathXmlApplicationContext(cfg);
		UserDao mapper = 
	            ctx.getBean("userDao", UserDao.class);
        List<User> list = mapper.findAll();
        for(User e : list) {
            System.out.println(
                e.getEmail() +" " + e.getPhone());
        }
    }
}
