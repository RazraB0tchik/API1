package com.projectapi.apiprojectmk1.filters;

import com.projectapi.apiprojectmk1.entity.AllUsers;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import org.hibernate.annotations.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CheckResponse extends OncePerRequestFilter {

    private final UserRepository userRepo;

    public CheckResponse(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest httpReq = (HttpServletRequest) request;
        HttpServletResponse httpRes= (HttpServletResponse) response;
        Cookie[] cookies = request.getCookies();
        String cookieId = null;
        if(cookies != null){
            for(Cookie ck: cookies){
                if(ck.getName().equals("user_id")){
                    cookieId=ck.getValue();
                }
            }
        }
        System.out.println(cookieId + "!!!!!!!!!");
        AllUsers user = userRepo.findAllUsersByUserId(cookieId);
        System.out.println(user + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if(user!=null){
          filterChain.doFilter(request, response);
        }
        else{
            response.sendError(401);
        }
    }
}
