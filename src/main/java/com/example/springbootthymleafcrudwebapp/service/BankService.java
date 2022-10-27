package com.example.springbootthymleafcrudwebapp.service;

import com.example.springbootthymleafcrudwebapp.model.Account_Details;
import com.example.springbootthymleafcrudwebapp.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BankService {
    List<Account_Details> getadd();
    public void addaccount(Account_Details account_details);
    Account_Details getAccountById(Long id);
    Account_Details getAccountByAdharcard(Account_Details account_details);
    void deleteAccountById(Long id);
    Page< Account_Details > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
