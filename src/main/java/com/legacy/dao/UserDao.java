package com.legacy.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	private final SqlSession sqlSession;
	
	@Autowired
	public UserDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		System.out.println("@@@  :: " + this.sqlSession);
	}
	
}

