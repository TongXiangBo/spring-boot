package com.neo.springcloudmybatisplus2;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neo.mapper.UserInfoMapper;
import com.neo.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisPlusTest {



    @Autowired
    private UserInfoMapper userInfoMapper;
    @Test
    public void testSelectOne() {
        //UserInfo user = userInfoMapper.selectById(1L);
        UserInfo user = userInfoMapper.selectById(1);

        System.out.println(user);
    }

    @Test
    public void testInsert() {
        UserInfo user = new UserInfo();
        user.setName("微笑1");
        user.setAge(31);
        user.setEmail("neo@tooool.org");
        userInfoMapper.insert(user);
       // assertThat(userInfoMapper.insert(user)).isGreaterThan(0);
        // 成功直接拿会写的 ID
       // assertThat(user.getId()).isNotNull();

    }

    @Test
    public void testDelete() {
        assertThat(userInfoMapper.deleteById(3L)).isGreaterThan(0);
        assertThat(userInfoMapper.delete(new QueryWrapper<UserInfo>()
                .lambda().eq(UserInfo::getName, "smile"))).isGreaterThan(0);
    }

    @Test
    public void testUpdate() {
        UserInfo user = userInfoMapper.selectById(2);
        assertThat(user.getAge()).isEqualTo(36);
        assertThat(user.getName()).isEqualTo("keep");

        userInfoMapper.update(
                null,
                Wrappers.<UserInfo>lambdaUpdate().set(UserInfo::getEmail, "123@123").eq(UserInfo::getId, 2)
        );
        assertThat(userInfoMapper.selectById(2).getEmail()).isEqualTo("123@123");
    }

    @Test
    public void testUpdateDemo() {
        UserInfo user = userInfoMapper.selectById(2);
        user.setAge(35);
        userInfoMapper.updateById(user);
        UserInfo userInfo = userInfoMapper.selectById(2);
        System.out.println(userInfo);
    }

    @Test
    public void testSelect() {
        List<UserInfo> userList = userInfoMapper.selectList(null);
       // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectCondition() {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.select("max(id) as id");
        List<UserInfo> userList = userInfoMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void testPage() {
        System.out.println("----- baseMapper 自带分页 ------");
        Page<UserInfo> page = new Page<>(1, 2);
        IPage<UserInfo> userIPage = userInfoMapper.selectPage(page, new QueryWrapper<UserInfo>()
                .gt("age", 6));
        assertThat(page).isSameAs(userIPage);
        System.out.println("总条数 ------> " + userIPage.getTotal());
        System.out.println("当前页数 ------> " + userIPage.getCurrent());
        System.out.println("当前每页显示数 ------> " + userIPage.getSize());
        print(userIPage.getRecords());
        System.out.println("----- baseMapper 自带分页 ------");
    }

    private <T> void print(List<T> list) {
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(System.out::println);
        }
    }


}