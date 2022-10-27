package com.example.springbootthymleafcrudwebapp.reposistry;

import com.example.springbootthymleafcrudwebapp.model.Account_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bankreposistry extends JpaRepository<Account_Details,Long> {

   // List<Account_Details> getAccountByAdharcard(String Adhar_Number,Long id);


}
