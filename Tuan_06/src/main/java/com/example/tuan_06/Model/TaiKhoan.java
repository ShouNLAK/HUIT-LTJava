package com.example.tuan_06.Model;

import jakarta.persistence.*;

@Entity
@Table(name="TaiKhoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public int ID;
    @Column(name = "FirstName")
    public String FirstName;
    @Column(name = "LastName")
    public String LastName;
    @Column(name = "Email")
    public String Email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public TaiKhoan() {}

    public TaiKhoan(int ID, String firstName, String lastName, String email) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }
}
