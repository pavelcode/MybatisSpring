package com.cblue.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cblue.entity.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	public User queryById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("com.cblue.mapper.UserMapper.findUserById", id);
		return user;
	}

}
