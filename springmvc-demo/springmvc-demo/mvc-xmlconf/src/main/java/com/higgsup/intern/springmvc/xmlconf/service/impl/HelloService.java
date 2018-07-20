package com.higgsup.intern.springmvc.xmlconf.service.impl;

import com.higgsup.intern.springmvc.xmlconf.model.Person;
import com.higgsup.intern.springmvc.xmlconf.service.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
    public Person getPerson() {
        return new Person("Jon", "Snow");
    }
}
