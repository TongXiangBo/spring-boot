package com.example.springbootmybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.mapper")
@ComponentScan("com.example.mapper")
@SpringBootApplication
public class SpringBootMybatisPlusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisPlusDemoApplication.class, args);
	}

}
