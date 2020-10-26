package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdata")
public class UserData {

    public UserData() {}

    @Id
    @Column(name="name")
    private String name;

    @Column(name="company_name")
    private String companyName;

    @Column(name="city")
    private String city;

    public UserData(String name, String companyName, String city) {
        this.name = name;
        this.companyName = companyName;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
