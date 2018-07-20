package com.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.SpringMVC.Dao;
@Repository
public class UserDao implements Dao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean check(String name, String pwd) {
		String sql = "select count(id) from accounts where name=? and pwd=?";
		int i  = jdbcTemplate.queryForObject(sql, new Object[]{name,pwd}, Integer.class);
		if (i>0) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void addUser(String name, String pwd) {
		String sql = "insert into accounts (name,pwd) values(?,?)";
		jdbcTemplate.update(sql,new Object[]{name,pwd});
	}
	@Override
	public boolean unit(String name) {
		String sql = "select count(id) from accounts where name=?";
		int rs = jdbcTemplate.queryForObject(sql,new Object[]{name}, Integer.class);
		if (rs>0) {
			return true;
		}
		return false;
	}
}
