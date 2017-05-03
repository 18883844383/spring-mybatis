package com.tarena.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.tarena.entity.User;

public class MyBatisEmpDao implements UserDao {

	public List<User> findAll() {
        /*SqlSession session = MyBatisUtil.getSession();
        List<User> list = session.selectList("com.tarena.dao.UserMapper.findAll");
        session.close();
        return list;*/
		return null;
    }
}
