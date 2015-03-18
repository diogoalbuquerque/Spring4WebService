package com.mycompany.component;


import com.mycompany.domain.User;
import com.mycompany.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public boolean saveUser(User user) {
        if (user.getId() == 0) {
            return userMapper.insertUser(user) == 1;
        } else {
            return userMapper.updateUser(user) == 1;
        }
    }
}