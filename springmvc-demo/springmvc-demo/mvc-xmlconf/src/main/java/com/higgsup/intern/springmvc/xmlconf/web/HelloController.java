package com.higgsup.intern.springmvc.xmlconf.web;

import com.higgsup.intern.springmvc.xmlconf.model.Person;
import com.higgsup.intern.springmvc.xmlconf.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    private IHelloService helloService;

    @Autowired
    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {        //Handler
        Person person = helloService.getPerson();
        model.addAttribute("person", person);
        return "index";
    }
}
