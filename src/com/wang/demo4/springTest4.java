package com.wang.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**声明式事务的使用:基于注解的
 * @author asus
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class springTest4 {
	@Autowired
	@Qualifier("accountService")
	private accountService accountService;
	
	
	@Test
	public void demo1(){
		accountService.transfer("aaa", "bbb", 100.00);
	}
}
