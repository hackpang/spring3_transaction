package com.wang.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class accountDaoImpl extends JdbcDaoSupport implements accountDao{

	public void out(String from, double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money - ? where name = ?";
		getJdbcTemplate().update(sql, money, from);
	}

	public void in(String to, double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money + ? where name = ?";
		getJdbcTemplate().update(sql, money, to);
	}

}
