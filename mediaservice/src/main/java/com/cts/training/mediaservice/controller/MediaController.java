package com.cts.training.mediaservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.mediaservice.entity.Media;
import com.cts.training.mediaservice.repository.MediaRepository;


@RestController
public class MediaController {
	
	@Autowired
	private MediaRepository mediarepository;
	
	@GetMapping("/media/{mediaId}")
	public ResponseEntity<Media> getRatings(@PathVariable Integer mediaId){
		List<Media>media  = this.mediarepository.findAll();
		return null;

	
	

}
}
