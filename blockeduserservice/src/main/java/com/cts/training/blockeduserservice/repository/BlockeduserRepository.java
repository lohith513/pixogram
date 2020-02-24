package com.cts.training.blockeduserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.blockeduserservice.entity.Blocked;

@Repository

public interface BlockeduserRepository extends JpaRepository<Blocked, Integer> {

}
