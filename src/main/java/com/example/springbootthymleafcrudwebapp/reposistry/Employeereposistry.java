package com.example.springbootthymleafcrudwebapp.reposistry;

import com.example.springbootthymleafcrudwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface Employeereposistry extends JpaRepository<Employee,Long> {


 //  public void deleteEmployeeById(Long id);


    //void delete(Long id);
}
