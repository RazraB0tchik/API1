package com.projectapi.apiprojectmk1.services;

import com.projectapi.apiprojectmk1.entity.AllUsers;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import java.util.UUID;

@Service
public class CookieService {
    @Autowired
    UserRepository userRepository;

    public Cookie createNewCookie(AllUsers user) {
        String user_id = UUID.randomUUID().toString();
        user.setUserId(user_id);
        userRepository.save(user);
        Cookie cookie = new Cookie("user_id", user_id);
        cookie.setPath("/");
        cookie.setDomain("localhost");
        cookie.setMaxAge(3600);
//        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        return cookie;
    }
}
