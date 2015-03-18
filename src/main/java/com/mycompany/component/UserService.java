package com.mycompany.component;

import com.mycompany.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public boolean saveUser(User user);

}
