package com.example.mapper;

import com.example.model.UserInfo;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface UserRepository extends JpaRepository<UserInfo,Integer>, ApplicationContextAware {

    /*UserInfo findById(long id);
    Long deleteById(Long id);*/
}
