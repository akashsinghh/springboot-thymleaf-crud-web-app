package com.example.springbootthymleafcrudwebapp.service;

import com.example.springbootthymleafcrudwebapp.model.Employee;
import com.example.springbootthymleafcrudwebapp.reposistry.Employeereposistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeserviceImp implements  Employeeservicess{
    @Autowired
    Employeereposistry employeereposistry;
    @Override
    public List<Employee> getallemps() {
        return employeereposistry.findAll();

    }

    @Override
    public void saveEmployee(Employee employee) {
            this.employeereposistry.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee > optional=employeereposistry.findById(id);
        Employee employee=null;
        if(optional.isPresent()){
            employee=optional.get();
        }else {
            throw new RuntimeException("employee not found ::"+id );

        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.employeereposistry.deleteById(id);
    }
//
//    @Override
//    public Page<Employee> findPaginated(int pageNo, int pageSize) {
//        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
//        return this.employeereposistry.findAll(pageable);
//    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.employeereposistry.findAll(pageable);
    }


}
