package com.example.springbootthymleafcrudwebapp.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Column(name = "First_name")
    private  String firstName;
    @Column(name = "Last_name")
    private  String lastName;
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "Email")
    private String email;

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
