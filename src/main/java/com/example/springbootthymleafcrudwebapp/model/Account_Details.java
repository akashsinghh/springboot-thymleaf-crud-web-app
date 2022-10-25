package com.example.springbootthymleafcrudwebapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account_Details {
    @Id
    @GeneratedValue
    public  String Accountno;
    public String Name;
    public String current_address;
    public String Permanent_address;
    public String PAN_Number;
    public String Adhar_Number;
    public String amount;



}
