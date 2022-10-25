//package com.example.springbootthymleafcrudwebapp.controller;
//
//import com.example.springbootthymleafcrudwebapp.model.Teacher;
//import com.example.springbootthymleafcrudwebapp.service.Teacherservice;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class TeacherController {
//    @Autowired
//    Teacherservice teacherservice;
//
//    @GetMapping("/")
//    public String viewTeaherhomepage(Model model) {
//        model.addAttribute("Listofteacher", teacherservice.getallteacher());
//        return "indexx";
//    }
//
//    @GetMapping("/showNewTeacherForm")
//    public String showNewEmployeeForm(Model model) {
//        // create model attribute to bind form data
//        Teacher teacher = new Teacher();
//        model.addAttribute("employee", teacher);
//        return "new_employee";
//    }
//}
