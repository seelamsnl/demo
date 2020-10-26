package com.example.demo;

public class Users {

    private static String name;
    private static String company;
    private static String city;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Users.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Users.company = company;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Users.city = city;
    }
}
