package com.mycompany.component;

import com.mycompany.domain.User;

import java.util.List;

public interface UserService {

    /**
     * @return a list of all {@link User}s
     */
    public List<User> getAllUsers();

    /**
     * @param user
     * @return success
     */
    public boolean saveUser(User user);

}
