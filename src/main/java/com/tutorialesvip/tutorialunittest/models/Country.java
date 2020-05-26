package com.tutorialesvip.tutorialunittest.models;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "iso_code")
    private String isoCode;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_capital")
    private String countryCapital;
    @Column(name = "country_independence_date")
    private String countryIdependenceDate;

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public String getCountryIdependenceDate() {
        return countryIdependenceDate;
    }

    public void setCountryIdependenceDate(String countryIdependenceDate) {
        this.countryIdependenceDate = countryIdependenceDate;
    }
}
