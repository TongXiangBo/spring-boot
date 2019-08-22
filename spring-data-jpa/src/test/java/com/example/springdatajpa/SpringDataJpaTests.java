package com.example.springdatajpa;

import com.example.mapper.UserRepository;
import com.example.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaTests {


	@Autowired
	private UserRepository userRepository;




	@Test
	public void testFind(){
		List<UserInfo> all = userRepository.findAll();
		System.out.println(all);
	}

	@Test
	public  void  testSave(){
		UserInfo userInfo = new UserInfo();
		userInfo.setAge(11);
		userInfo.setName("zhongguo");
		userInfo.setEmail("1111@222");
		userRepository.save(userInfo);

		//userRepository.deleteById(1);
	}

	@Test
	public void testUpdate(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setAge(22);
		userInfo.setName("zhongguo");
		userInfo.setEmail("1111@222");
		userRepository.saveAndFlush(userInfo);
	}
	@Test
	public void testDelete(){

		userRepository.deleteById(2);
	}
}
