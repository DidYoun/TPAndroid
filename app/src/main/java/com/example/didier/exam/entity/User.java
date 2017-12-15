package com.example.didier.exam.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

public class User {
    private String firstname;
    private String lastname;
    private String email;
    private String birthday;

    public User(String firstname, String lastname, String email, String birthday) {
        super();

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.birthday = birthday;
    }

    public HashMap<String, String> convertUser()
    {
        HashMap<String, String> hash = new HashMap<>();

        hash.put("lastname", this.lastname);
        hash.put("firstname", this.firstname);
        hash.put("email", this.email);

        return hash;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
