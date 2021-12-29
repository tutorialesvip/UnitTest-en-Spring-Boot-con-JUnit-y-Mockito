package com.tutorialesvip.tutorialunittest.models;

public class CountryResponse {
    private String countryName;
    private String capitalName;
    private String independenceDate;
    private int yearsOfIndependency;
    private int monthsOfIndependency;
    private int dayssOfIndependency;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getIndependenceDate() {
        return independenceDate;
    }

    public void setIndependenceDate(String independenceDate) {
        this.independenceDate = independenceDate;
    }

    public int getYearsOfIndependency() {
        return yearsOfIndependency;
    }

    public void setYearsOfIndependency(int yearsOfIndependency) {
        this.yearsOfIndependency = yearsOfIndependency;
    }

    public int getMonthsOfIndependency() {
        return monthsOfIndependency;
    }

    public void setMonthsOfIndependency(int monthsOfIndependency) {
        this.monthsOfIndependency = monthsOfIndependency;
    }

    public int getDayssOfIndependency() {
        return dayssOfIndependency;
    }

    public void setDayssOfIndependency(int dayssOfIndependency) {
        this.dayssOfIndependency = dayssOfIndependency;
    }
}
