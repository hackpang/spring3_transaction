package com.wang.demo4;

public interface accountService {
	/**
	 * 转账方法
	 * @param from:从哪转出
	 * @param to：转给谁
	 * @param money：转多少钱
	 */
	public void transfer(String from,String to,Double money);
}
