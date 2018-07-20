package com.higgsup.intern.springmvc.javaconf.web;

import com.higgsup.intern.springmvc.javaconf.model.Country;
import com.higgsup.intern.springmvc.javaconf.model.Person;
import com.higgsup.intern.springmvc.javaconf.service.ICountryService;
import com.higgsup.intern.springmvc.javaconf.service.impl.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/country")
public class CountryController {
    private ICountryService countryService;

    @Autowired
    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {
        Country country = countryService.createNewCountry();
        model.addAttribute("country", country);
        return "index1";
    }
}
