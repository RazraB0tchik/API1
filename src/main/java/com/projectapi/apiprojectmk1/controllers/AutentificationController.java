package com.projectapi.apiprojectmk1.controllers;
import com.projectapi.apiprojectmk1.filters.CheckResponse;
import com.projectapi.apiprojectmk1.DTO.UserDTO;
import com.projectapi.apiprojectmk1.entity.AllUsers;
import com.projectapi.apiprojectmk1.repository.RoleRepository;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import com.projectapi.apiprojectmk1.services.CookieService;
import com.projectapi.apiprojectmk1.services.UserService;
import org.apache.catalina.connector.Response;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

@RestController
public class AutentificationController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserService userService;

    @Autowired
    CookieService cookieService;
//    @GetMapping(value = "/set-cookie")
//    public ResponseEntity<?> setCookies(HttpServletResponse servletResponse, String user_id) throws IOException {
//    }
//
//    @GetMapping(value = "/get-cookie")
//    public String getCookie(@CookieValue(value = "user_id", defaultValue = "user not found") String user_id){
//        return user_id;
//    }

    @GetMapping(value = "/get-user")
    public ResponseEntity<?> getJSONUser(@RequestBody UserDTO body, HttpServletResponse httpServletResponse){
        AllUsers allUsers = userService.loadUserByName(body.getName());
        if(allUsers!=null){
         httpServletResponse.addCookie(cookieService.createNewCookie(allUsers));
            return ResponseEntity.ok().body(HttpStatus.OK);
        }
        else {
            return ResponseEntity.ok().body(HttpStatus.BAD_REQUEST);
        }
    }

//    public String readCookie(
//            @CookieValue(name = "user_id", defaultValue = "default-user-id") String userId) {
//        return userId;
//    }
}
