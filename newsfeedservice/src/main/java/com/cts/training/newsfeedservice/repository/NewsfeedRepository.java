package com.cts.training.newsfeedservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.newsfeedservice.entity.Newsfeed;
import com.sun.xml.bind.v2.model.core.ID;

@Repository


public interface NewsfeedRepository extends JpaRepository<Newsfeed, ID> {

}
