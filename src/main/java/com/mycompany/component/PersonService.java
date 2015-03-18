package com.mycompany.component;

import com.mycompany.domain.Person;
import com.mycompany.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService implements IPersonService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Person getPersonDetail(Integer id) {

        System.out.println(userMapper.getAllUsers().size());
        Person p = new Person();
        p.setId(id);
        p.setLocation("Rio de Janeiro");
        p.setName("Diogo Albuquerque");
        return p;
    }
}
