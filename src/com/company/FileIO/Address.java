package com.company.FileIO;

public class Address {

    String firstname;
    String lastname;
    String mobileNumber;
    String email;

    public Address(String firstname, String lastname, String mobileNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
        this.email = email;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
