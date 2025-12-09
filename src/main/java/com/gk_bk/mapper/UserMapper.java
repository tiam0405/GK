package com.gk_bk.mapper;

import com.gk_bk.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserMapper {
    int insert(User user);
    Optional<User> findById(@Param("id") Long id);
    Optional<User> findByUsername(@Param("username") String username);
}


