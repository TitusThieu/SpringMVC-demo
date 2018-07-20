package com.higgsup.intern.springmvc.javaconf.service.impl;

import com.higgsup.intern.springmvc.javaconf.dao.CountryDAO;
import com.higgsup.intern.springmvc.javaconf.model.Country;
import com.higgsup.intern.springmvc.javaconf.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryService implements ICountryService {
    @Autowired
    CountryDAO countryDAO;
    @Override
    public Country createNewCountry() {
        return countryDAO.createNewCountry();
    }

    }

