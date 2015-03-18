package com.mycompany.persistence;

import com.mycompany.domain.User;

import java.util.List;


public interface UserMapper {

    /**
     * @return all the users
     */
    public List<User> getAllUsers();

    /**
     * @param user
     * @return the number of rows affected
     */
    public int insertUser(User user);

    /**
     * @param user
     * @return the number of rows affected
     */
    public int updateUser(User user);
}
