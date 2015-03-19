package com.mycompany.component;

import com.mycompany.domain.Person;
import com.mycompany.domain.User;
import com.mycompany.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService implements IPersonService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Person getPersonDetail(Integer id) {

        List<User> usuario = userMapper.getAllUsers();

        for (User user : usuario) {
            System.out.println(user.getId() + " - " + user.getFirstName());
        }

        Person p = new Person();
        p.setId(id);
        p.setLocation("Rio de Janeiro");
        p.setName("Diogo Albuquerque");
        return p;
    }
}
