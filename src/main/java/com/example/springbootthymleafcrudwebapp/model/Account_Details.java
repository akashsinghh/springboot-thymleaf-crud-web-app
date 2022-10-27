package com.example.springbootthymleafcrudwebapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account_Details {
    @Id
    @GeneratedValue
    Long id;
    public  String Accountno;
    public String Name;
    public String current_address;
    public String Permanent_address;
    public String PAN_Number;
    public String Adhar_Number;
    public String amount;

    public Account_Details() {
    }

//    public Account_Details(Long id, String accountno, String name, String current_address, String permanent_address, String PAN_Number, String adhar_Number, String amount) {
//        this.id = id;
//        Accountno = accountno;
//        Name = name;
//        this.current_address = current_address;
//        Permanent_address = permanent_address;
//        this.PAN_Number = PAN_Number;
//        Adhar_Number = adhar_Number;
//        this.amount = amount;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountno() {
        return Accountno;
    }

    public void setAccountno(String accountno) {
        Accountno = accountno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    public String getPermanent_address() {
        return Permanent_address;
    }

    public void setPermanent_address(String permanent_address) {
        Permanent_address = permanent_address;
    }

    public String getPAN_Number() {
        return PAN_Number;
    }

    public void setPAN_Number(String PAN_Number) {
        this.PAN_Number = PAN_Number;
    }

    public String getAdhar_Number() {
        return Adhar_Number;
    }

    public void setAdhar_Number(String adhar_Number) {
        Adhar_Number = adhar_Number;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
