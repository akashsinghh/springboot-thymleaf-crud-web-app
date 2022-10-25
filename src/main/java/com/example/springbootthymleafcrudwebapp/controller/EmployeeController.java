package com.example.springbootthymleafcrudwebapp.controller;

import com.example.springbootthymleafcrudwebapp.model.Employee;
import com.example.springbootthymleafcrudwebapp.service.Employeeservicess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    Employeeservicess employeeservicess;
    @RequestMapping("/")
    public String viewpage(Model model){
        return findPaginated(1, "firstName", "asc", model);
      // model.addAttribute("list", employeeservicess.getallemps());
      // return "index";
    }
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        // create model attribute to bind form data
        Employee employee=new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        // save employee to database
        employeeservicess.saveEmployee(employee);

        return "redirect:/";

    }
    @GetMapping ("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        // get employee from the service
        Employee employee=employeeservicess.getEmployeeById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employees",employee);
        return "Update_employee";

    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable(value = "id") Long id){
        // call delete employee method
        this.employeeservicess.deleteEmployeeById(id);
        return "redirect:/";
    }
    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page < Employee > page = employeeservicess.findPaginated(pageNo, pageSize, sortField, sortDir);
        List < Employee > listEmployees = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("list", listEmployees);
        return "index";
    }
}
