package com.mycompany.persistence;

import com.mycompany.domain.User;

import java.util.List;


public interface UserMapper {

    public List<User> getAllUsers();

    public int insertUser(User user);

    public int updateUser(User user);
}
