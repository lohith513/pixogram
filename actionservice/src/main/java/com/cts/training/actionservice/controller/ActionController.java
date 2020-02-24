package com.cts.training.actionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.actionservice.repository.ActionRepository;
import com.cts.training.mediaservice.entity.Media;

@RestController

public class ActionController {
	
	@Autowired
	
	private ActionRepository actionrepository;
	
	
	@GetMapping("/Action/{actionId}")
	public ResponseEntity<Media> getRatings(@PathVariable Integer mediaId){
		List<Media> media = this.mediarepository.findAll();
		return null;


}
