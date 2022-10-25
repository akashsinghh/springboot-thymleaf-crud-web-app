package com.example.springbootthymleafcrudwebapp.service;

import com.example.springbootthymleafcrudwebapp.model.Employee;
import com.example.springbootthymleafcrudwebapp.reposistry.Employeereposistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Employeeservicess {
    List<Employee> getallemps();
   public void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);

    //Page<Employee> findPaginated(int pageNo, int pageSize);

    // Page<Employee> findPaginated(int pageNo, int pageSize);
    Page < Employee > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
