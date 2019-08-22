package com.neo.springcloudmybatisplus2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.neo.mapper")
@SpringBootApplication
public class SpringCloudMybatisplus2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMybatisplus2Application.class, args);
	}

}
