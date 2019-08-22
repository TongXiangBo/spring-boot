package com.example.springdatajpa;

import com.example.mapper.UserRepository;
import com.example.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaTests {


	@Autowired
	private UserRepository userRepository;




	@Test
	public void getUser(){
		UserInfo one = userRepository.getOne(1);
		System.out.println(one);

	}

}
