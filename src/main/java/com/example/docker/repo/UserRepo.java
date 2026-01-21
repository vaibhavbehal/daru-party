package com.example.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.docker.entuty.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
