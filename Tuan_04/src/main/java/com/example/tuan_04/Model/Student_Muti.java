package com.example.tuan_04.Model;

import org.jspecify.annotations.NonNull;

import java.util.List;
import jakarta.


public class Student_Muti {
    private String firstName;

    private String lastName;
    private String country;
    private String favLang;
    private List<String> favOS;

    public Student_Muti() {}

    public Student_Muti(String firstName, String lastName, String country, String favLang, List<String> favOS) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favLang = favLang;
        this.favOS = favOS;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String  getLastName()
    {
        return lastName;
    }
    public String  getCountry()
    {
        return country;
    }
    public String  getFavLang()
    {
        return favLang;
    }
    public List<String> getFavOS()
    {
        return favOS;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public void setFavLang(String favLang)
    {
        this.favLang = favLang;
    }
    public void setFavOS(List<String> favOS)
    {
        this.favOS = favOS;
    }

}
