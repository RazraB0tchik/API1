package com.projectapi.apiprojectmk1.services;

//import com.projectapi.apiprojectmk1.DTO.UserDTO;
//import com.projectapi.apiprojectmk1.entity.User;
//import com.projectapi.apiprojectmk1.repository.RoleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.UUID;
//
//public class RegistrationService {
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    public User createNewUser(UserDTO body){
//        User user = new User();
//        user.setActivationCode(UUID.randomUUID().toString());
//        user.setRole(roleRepository.findRoleById(1));
//        user.setActive(true);
//        user.setEmail(body.getEmail());
//        user.setName(body.getName());
//        user.setPassword(body.getPassword());
//        return user;
//    }
//}
