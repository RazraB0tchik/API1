//package com.projectapi.apiprojectmk1.controllers;
//
//import com.projectapi.apiprojectmk1.entity.User;
//import com.projectapi.apiprojectmk1.repository.RoleRepository;
//import com.projectapi.apiprojectmk1.repository.UserRepository;
//import com.projectapi.apiprojectmk1.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.validation.Valid;
//import java.util.*;
//
//@RestController
//public class MainController {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/allUser")
//    public User findUserByRole() {
////        List<User> Users = userRepository.findUsersByRole_Id(1);
////        return Users;
////        return userRepository.findUsersByRole_Id(1);
//        User user = userRepository.findByName("Makar");
//        return user;
//    }
//
//    @GetMapping("/showAboba")
//    public String show() {
//        return "aboba";
//    }
//}
//
//
