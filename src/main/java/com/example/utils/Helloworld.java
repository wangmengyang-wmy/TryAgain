package com.example.utils;

public class Helloworld {
    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Helloworld{" +
                "country='" + country + '\'' +
                '}';
    }
}
