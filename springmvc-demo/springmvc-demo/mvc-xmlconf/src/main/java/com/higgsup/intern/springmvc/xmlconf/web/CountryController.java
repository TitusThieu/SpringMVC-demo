package com.higgsup.intern.springmvc.xmlconf.web;

import com.higgsup.intern.springmvc.xmlconf.model.Country;
import com.higgsup.intern.springmvc.xmlconf.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    CountryService countryService = new CountryService();

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    public List getCountries() {
        List listOfCountries = countryService.getAllCountries();
        return listOfCountries;
    }

    @RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Country getCountryById(@PathVariable int id) {
        return countryService.getCountry(id);
    }

    @RequestMapping(value = "/countries", method = RequestMethod.POST, headers = "Accept=application/json")
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @RequestMapping(value = "/countries", method = RequestMethod.PUT, headers = "Accept=application/json")
    public Country updateCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);

    }

    @RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteCountry(@PathVariable("id") int id) {
        countryService.deleteCountry(id);

    }
}

