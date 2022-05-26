package com.projectapi.apiprojectmk1.repository;

import com.projectapi.apiprojectmk1.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUsersByRole_Id(int role);
    User findByName(String name);
}
