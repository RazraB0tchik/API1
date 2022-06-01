package com.projectapi.apiprojectmk1.repository;

import com.projectapi.apiprojectmk1.entity.AllUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface UserRepository extends JpaRepository<AllUsers, Long> {
    List<AllUsers> findUsersByRole_Id(int role);
    AllUsers findAllUsersByName(String name);
    AllUsers findUsersByEmail(String email);
    AllUsers findAllUsersByUserId(String userId);
    AllUsers findByUserId(String Userid);
    AllUsers findUserById(int id);
}
