package com.mycompany.component;

import com.mycompany.domain.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonService implements IPersonService {
    @Override
    public Person getPersonDetail(Integer id) {
        Person p = new Person();
        p.setId(id);
        p.setLocation("Rio de Janeiro");
        p.setName("Diogo Albuquerque");
        return p;
    }
}
