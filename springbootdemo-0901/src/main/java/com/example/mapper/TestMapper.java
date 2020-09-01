package com.example.mapper;

import com.example.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    List<UserInfo> findAllUser();
}
