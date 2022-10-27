package com.example.springbootthymleafcrudwebapp.service;

import com.example.springbootthymleafcrudwebapp.model.Account_Details;
import com.example.springbootthymleafcrudwebapp.model.Employee;
import com.example.springbootthymleafcrudwebapp.reposistry.Bankreposistry;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Service
public class BankserviceImpl implements BankService{
    @Autowired
    Bankreposistry bankreposistry;
    @Override
    public List<Account_Details> getadd() {
        return bankreposistry.findAll();
    }

    @Override
    public void addaccount(Account_Details account_details) {
        this.bankreposistry.save(account_details);

    }

//    @Override
//    public Account_Details getAccountById(Long id) {
//
//        Optional<Account_Details> optional=bankreposistry.findById(id);
//        Account_Details account_details=null;
//        if(optional.isPresent()){
//            account_details=optional.get();
//        }
////////        String panNumber = "AAAPL1234C"; // get your editext value here
////////        Pattern pattern = Pattern.compile("[A-Z]{3}[ABCFGHLJPTF]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}");
////////
////////        Matcher matcher = pattern.matcher(panNumber );
////////// Check if pattern matches
////////        if (matcher.matches()) {
////////            Log.i("Matching","Yes");
////////        }
////////        String PAN_Number="10";
////////        if(PAN_Number.){
////////
////////        }
//////        String panNumber = "AAAPL1234C"; // get your editext value here
//////        Pattern pattern = Pattern.compile("[A-Z]{3}[ABCFGHLJPTF]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}");
//////
//////        Matcher matcher = pattern.matcher(panNumber );
//////// Check if pattern matches
//////        if (matcher.matches()) Log.i("Matching", "Yes");
//          else {
//            throw new RuntimeException("account not found ::"+id );
//
//        }
//        return account_details;
////
////    }
    @Override
    public Account_Details getAccountById(Long id) {
        Optional<Account_Details > optional=bankreposistry.findById(id);
        Account_Details account=null;
        if(optional.isPresent()){
            account=optional.get();
        }else {
            throw new RuntimeException("Account not found ::"+id );

        }
        return account;
    }
    @Override
    public Account_Details getAccountByAdharcard(Account_Details account_details) {
        int getAccountByAdharcard=10;
        if(getAccountByAdharcard>=10){
            account_details=getAccountByAdharcard(account_details);

        }
        else {
            throw new RuntimeException("Adharcard num is less then 10 digit  ::" );

        }
        return account_details;

    }



    @Override
    public void deleteAccountById(Long id) {
        this.bankreposistry.deleteById(id);

    }

    @Override

        public Page<Account_Details> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
            Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                    Sort.by(sortField).descending();

            Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
            return this.bankreposistry.findAll(pageable);
        }
    }

