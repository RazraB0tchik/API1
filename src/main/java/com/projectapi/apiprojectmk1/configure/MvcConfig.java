package com.projectapi.apiprojectmk1.configure;

import com.projectapi.apiprojectmk1.filters.CheckResponse;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    UserRepository userRepository;

    @Bean
    public FilterRegistrationBean<CheckResponse> loggingFilter(){
        FilterRegistrationBean<CheckResponse> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new CheckResponse(userRepository));
//        registrationBean.addUrlPatterns("/get_user/*");

        return registrationBean;
    }
}
