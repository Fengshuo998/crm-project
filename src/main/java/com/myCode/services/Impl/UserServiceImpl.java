package com.myCode.services.Impl;

import com.myCode.dao.UserDao;
import com.myCode.domain.User;
import com.myCode.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;


    @Override
    public List<User> selectAllUser() {
        List<User> list = dao.selectAll();
        return list;
    }
}
