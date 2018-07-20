package com.higgsup.intern.springmvc.javaconf.model;

public class Country {
    String countryName;
    long pupulation;

    public Country() {
    }

    public Country(String countryName, long pupulation) {
        this.countryName = countryName;
        this.pupulation = pupulation;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPupulation() {
        return pupulation;
    }

    public void setPupulation(long pupulation) {
        this.pupulation = pupulation;
    }
}
