package com.wang.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class springTest2 {
	@Autowired
	@Qualifier("accountServiceProxy")
	private accountService accountService;
	
	
	@Test
	public void demo1(){
		accountService.transfer("aaa", "bbb", 100.00);
	}
}
