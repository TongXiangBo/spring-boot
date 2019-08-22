package com.example.springbootmybatisplusdemo;



import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisPlusTests {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void contextLoads() {

		EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
		entityWrapper.between("userage",1,1000);
		Page<User> page = new Page<User>(1,30);
		List<User> list = userMapper.selectPage(page, entityWrapper);
		for (User customer : list) {
			System.out.println(customer);
		}


	}
	@Test
	public void  selectAll() {
		EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
		List<User> users = userMapper.selectList(entityWrapper);
		User user= new User();
		user.setUserId(1L);
		User user1 = userMapper.selectOne(user);
		System.out.println(user1);
	}
@Test
	public void insert( ){
	User user= new User();
	user.setAddress("北京");
	user.setUserName("阳神");
	user.setBirthday(new Date());
	user.setPhoneNum(1538888999);
	user.setUserAge(101);
	user.setRemark("gujiu");


	Integer userId = userMapper.insert(user);
	System.out.println(userId);

};

	@Test
	public void update() {
		User user= new User();
		user.setAddress("北京1");
		user.setUserName("阳神1");
		user.setBirthday(new Date());
		user.setPhoneNum(1538888999);
		user.setUserAge(101);
		user.setRemark("gujiu1");
		user.setUserId(1L);


		 userMapper.updateById(user);


	}

	@Test
	public void delete() {
		EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
		//userid=101
		entityWrapper.eq("userId",101L);
		userMapper.delete(entityWrapper);



	}
}
