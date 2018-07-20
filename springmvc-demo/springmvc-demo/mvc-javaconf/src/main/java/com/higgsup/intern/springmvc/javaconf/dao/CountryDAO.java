package com.higgsup.intern.springmvc.javaconf.dao;

import com.higgsup.intern.springmvc.javaconf.model.Country;
import org.springframework.stereotype.Repository;

@Repository("countryDAO")
public class CountryDAO {
    public Country createNewCountry() {
        Country country = new Country("VietNam", 40000);
        return country;
    }
}
