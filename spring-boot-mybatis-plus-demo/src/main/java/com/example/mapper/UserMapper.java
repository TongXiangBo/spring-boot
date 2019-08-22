package com.example.mapper;




import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-08-16
 */
@Repository

public interface UserMapper extends BaseMapper<User> {


    public void deleteByUserId(@Param("id") Long id );

}
