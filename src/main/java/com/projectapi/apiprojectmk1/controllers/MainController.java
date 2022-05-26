package com.projectapi.apiprojectmk1.controllers;

import com.projectapi.apiprojectmk1.entity.User;
import com.projectapi.apiprojectmk1.repository.RoleRepository;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import com.projectapi.apiprojectmk1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.*;

@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/allUser")
    public List<User> findUserByRole() {
//        List<User> Users = userRepository.findAllByRole("USER");
        return userRepository.findUsersByRole_Id(1);
    }

    @GetMapping("/showAboba")
    public String show() {
        return "aboba";
    }

//    @GetMapping("/login")
//        public ModelAndView login(){
//            return new ModelAndView("login");
//        }
//
//    @PostMapping("/login")
//    public User findUserByAutorize(@RequestParam(name = "username") String name){
//        return userRepository.findByName(name);
//    }

    @GetMapping("/registration")
    public ModelAndView registration(User user) {
        return new ModelAndView("registration");
    }

    @PostMapping("/registration")
    public ModelAndView addUser(@Valid User user, BindingResult bindingResult, Model model) {

        User userfromDb = userRepository.findByName(user.getName());
        if (userfromDb != null) {
            return new ModelAndView("registration");
        }
        if (bindingResult.hasErrors() == true) {
            return new ModelAndView("registration");
        }
        User emailUser = userRepository.findUsersByEmail(user.getEmail());
        if (emailUser != null) {
            model.addAttribute("erroreEM", new Error("Email is Buisy"));
            return new ModelAndView("registration");
        }
//        if (bindingResult.hasErrors() == false) {
//            boolean check = userService.passwordValidation(user.getPassword(), user.getConfimPassword());
//            if(check==false){
//                model.addAttribute("errorePasw", "You must use 1 simbol (a-z),(A-Z),(0-9), size(7-20)");
//                return "registration";
//            }

            user.setActive(true);
            user.setRole(roleRepository.findRoleById(1));
            user.setEmail(user.getEmail());
            user.setActivationCode(UUID.randomUUID().toString());
            if (!Objects.equals(user.getPassword(), user.getConfimPassword())) {
                model.addAttribute("Errore", "Passwords do not match");
                model.addAttribute(new User());
                return new ModelAndView("registration");
            }
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setConfimPassword(passwordEncoder.encode(user.getConfimPassword()));//шифруем наши пароли на этапе создания пользователя
            userRepository.save(user);
        return new ModelAndView("login");
        }
    }
