package com.cts.training.followingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.followingservice.entity.Following;

@Repository
public interface FollowingRepository  extends JpaRepository<Following, Integer>{

}
