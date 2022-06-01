package com.projectapi.apiprojectmk1.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "all_users")
public class AllUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "password")
    String password;

    @Column(name="email")
    String email;

    @Column(name = "confpass")
    String confimPassword;

    @Column(name = "active")
    Boolean active;

    @Column(name = "userid")
    String userId;

    @Column(name = "actcode")
    String activationCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roles")
    private Role role;

    public AllUsers(String name, String password, String email, String confimPassword, Boolean active, String userId, String activationCode) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.confimPassword = confimPassword;
        this.active = active;
        this.userId = userId;
        this.activationCode = activationCode;
    }

    public AllUsers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfimPassword() {
        return confimPassword;
    }

    public void setConfimPassword(String confimPassword) {
        this.confimPassword = confimPassword;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AllUsers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", confimPassword='" + confimPassword + '\'' +
                ", active=" + active +
                ", userId='" + userId + '\'' +
                ", activationCode='" + activationCode + '\'' +
                ", role=" + role +
                '}';
    }
}
