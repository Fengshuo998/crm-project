package com.myCode.dao;

import com.myCode.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> selectAll();
}
