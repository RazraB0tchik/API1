//package com.projectapi.apiprojectmk1.entity;
//
//import org.springframework.stereotype.Component;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "users")
//@Component
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    int id;
//
//    @Column(name = "name")
//    String name;
//
//    @Column(name = "password")
//    String password;
//
//    @Column(name = "email")
//    String email;
//
//    String confimPassword;
//
//    @Column(name = "active")
//    Boolean active;
//
//    String activationCode;
//
//    String userId;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "role_id")
//    private Role role;
//
//    public User(String name, String password, String email, String confimPassword, Boolean active, String activationCode, String userId) {
//        this.name = name;
//        this.password = password;
//        this.email = email;
//        this.confimPassword = confimPassword;
//        this.active = active;
//        this.activationCode = activationCode;
//        this.userId = userId;
//    }
//
//    public User() {
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getActivationCode() {
//        return activationCode;
//    }
//
//    public void setActivationCode(String activationCode) {
//        this.activationCode = activationCode;
//    }
//
//    public String getConfimPassword() {
//        return confimPassword;
//    }
//
//    public void setConfimPassword(String confimPassword) {
//        this.confimPassword = confimPassword;
//    }
//
//    public Boolean getActive() {
//        return active;
//    }
//
//    public void setActive(Boolean active) {
//        this.active = active;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String user_id) {
//        this.userId = user_id;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
