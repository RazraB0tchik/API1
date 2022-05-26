package com.projectapi.apiprojectmk1.controllers;

import com.projectapi.apiprojectmk1.entity.User;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/allUser")
    public List<User> findUserByRole(){
//        List<User> Users = userRepository.findAllByRole("USER");
        return userRepository.findUsersByRole_Id(1);
    }
}
