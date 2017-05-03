package com.tarena.dao;

import java.util.List;

import com.tarena.annotation.MyBatisRepository;
import com.tarena.entity.User;
@MyBatisRepository
public interface UserDao {

	List<User> findAll();
}
