package com.wang.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class accountServiceImpl implements accountService{
	
	
	private accountDao accountDao;
	

	public void setAccountDao(accountDao accountDao) {
		this.accountDao = accountDao;
	}


	public void transfer(final String from, final String to, final Double money) {
		
				accountDao.out(from, money);
				int d=1/0;
				accountDao.in(to, money);
			}

}
