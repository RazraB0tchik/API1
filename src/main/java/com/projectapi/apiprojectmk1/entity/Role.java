package com.projectapi.apiprojectmk1.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@Component
public class Role {
    public List<AllUsers> getUserWithRole() {
        return userWithRole;
    }

    public void setUserWithRole(List<AllUsers> userWithRole) {
        this.userWithRole = userWithRole;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "role")
    String role;

    @OneToMany(fetch = FetchType.LAZY)
    private List<AllUsers> userWithRole;

    public Role(String role) {
        this.role = role;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
