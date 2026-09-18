package com.example.tuan_05.Model;

import jakarta.persistence.*;

@Entity
@Table(name="SinhVien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column (name = "email")
    private String email;

    public SinhVien() {}
    public SinhVien(String First, String Last, String Email)
    {
        firstName = First;
        lastName = Last;
        email = Email;
    }

    public void setId(int ID)
    {
        this.id = ID;
    }
    public void setFirstName(String First)
    {
        this.firstName = First;
    }
    public void setLastName(String Last)
    {
        this.lastName = Last;
    }
    public void setEmail(String Email)
    {
        this.email = Email;
    }
    public int getId()
    {
        return id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getEmail()
    {
        return email;
    }

}
