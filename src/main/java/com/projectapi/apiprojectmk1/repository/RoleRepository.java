package com.projectapi.apiprojectmk1.repository;

import com.projectapi.apiprojectmk1.entity.Role;
import com.projectapi.apiprojectmk1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(int id);
    Role findRoleByRole(String name);
}
