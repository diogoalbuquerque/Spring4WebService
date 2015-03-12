package com.mycompany.controller;

import com.mycompany.component.IPersonService;
import com.mycompany.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class PersonController {
    @Autowired
    private IPersonService personService;

    @RequestMapping("/person")
    public Person getPersonDetail(@RequestParam(value = "id", required = false,
            defaultValue = "0") Integer id) {
        return personService.getPersonDetail(id);
    }
}
