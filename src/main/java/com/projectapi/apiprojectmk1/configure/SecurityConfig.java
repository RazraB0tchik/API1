//package com.projectapi.apiprojectmk1.configure;
//
//import com.projectapi.apiprojectmk1.filters.CheckResponse;
//import com.projectapi.apiprojectmk1.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//
//@Configuration
//@EnableConfigurationProperties
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
////    @Autowired
////    private UserService service;
////
////    @Override
////    public void configure(AuthenticationManagerBuilder auth) throws Exception{
////        auth.userDetailsService(service);
////    }
//
//    @Bean
//    public FilterRegistrationBean<CheckResponse> loggingFilter(){
//        FilterRegistrationBean<CheckResponse> registrationBean
//                = new FilterRegistrationBean<>();
//
//        registrationBean.setFilter(new CheckResponse());
//        registrationBean.addUrlPatterns("/get-user/*");
//
//        return registrationBean;
//    }
//
//}
