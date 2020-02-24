package com.cts.training.userservice.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.userservice.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Id> {

}
