package com.my.app.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.my.app.entity.User;

import java.util.List;

@Mapper
public interface UserRepository {
    @Select("SELECT * FROM USERS")
    List<User> getAll();

}