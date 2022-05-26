package com.projectapi.apiprojectmk1.services;


import com.projectapi.apiprojectmk1.entity.Role;
import com.projectapi.apiprojectmk1.entity.User;
import com.projectapi.apiprojectmk1.repository.RoleRepository;
import com.projectapi.apiprojectmk1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service

public class UserService implements UserDetailsService {

    private final RoleRepository roleRepository;

    private final UserRepository userRepository;

    public UserService(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        System.out.println(user);

        if (user == null) {
            throw new UsernameNotFoundException("User not founded!");
        }
        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(roleRepository.findRoleById(1).getRole()));
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), authorities);
    }

//    public UserDetails findByEmail(String email) throws UsernameNotFoundException {
//        User user = userRepository.findUsersByEmail(email);
//        if (user == null) {
//            throw new UsernameNotFoundException("We cant find email!");
//        } else {
//            return user;
//        }
//    }

//    public User finByCode(String code){
//        User user = userRepository.findByActivationCode(code);
//        return user;
//    }

//    public boolean activateUser(String code) {
//        User user = userRepository.findByActivationCode(code);
//
//        if(user == null){
//            return false;
//        }
//        user.setActivationCode(UUID.randomUUID().toString());
//
//        userRepository.save(user);
//        return true;
//    }

//    public boolean passwordValidation(String password, String confimPassword){
//        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{7,20}$");
//
//        Matcher mat1 = pattern.matcher(password);
//        Matcher mat2 = pattern.matcher(confimPassword); //валидация
//
//        if((mat1.matches() == false)||(mat2.matches() == false)){
//           return false;
//        }
//        return true;
//    }
}
