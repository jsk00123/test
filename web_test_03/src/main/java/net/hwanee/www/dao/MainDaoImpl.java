package net.hwanee.www.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MainDaoImpl extends SqlSessionDaoSupport implements MainDao {

	public String getUserPwd(String userid) {
		return (String)getSqlSession().selectOne("common.getUserPwd",userid);
	}
	
}
