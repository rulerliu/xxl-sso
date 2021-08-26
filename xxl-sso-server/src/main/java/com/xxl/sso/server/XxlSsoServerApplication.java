package com.xxl.sso.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-03-22 23:41:47
 */
@SpringBootApplication
public class XxlSsoServerApplication {

	/**
	 * 账号密码：user/123456
	 * @param args
	 */
	public static void main(String[] args) {
        SpringApplication.run(XxlSsoServerApplication.class, args);
	}

}