package com.cashier.util;

import org.mybatis.generator.api.ShellRunner;

public class GetAutoEntityAndDao {

	// 该配置文件放在src\\main\\resources\\该路径下即可
	public static void main(String[] args) {
		args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite" };
		ShellRunner.main(args);
	}

}