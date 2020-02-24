package com.cts.training.mediaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.mediaservice.entity.Media;

@Repository

public interface MediaRepository extends JpaRepository<Media, Integer> {

}
