package com.pixogram.mediaplumbingservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pixogram.mediaplumbingservice.feignproxy.MediaServiceProxy;
import com.pixogram.mediaplumbingservice.model.MediaDataModel;




@RestController
public class MediaServicePlumbingController {
	@Autowired
	private MediaServiceProxy mediaServiceProxy;
	Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String MEDIA_URL ="http://localhost:7004/media-service/media";
	@PostMapping("/media")
	public void post(@RequestParam("file") MultipartFile file,
					@RequestParam("url") String url,
					@RequestParam("title") String title,
					@RequestParam("description") String description,
					@RequestParam("tags") String tags,
					@RequestParam("userid") String userid,
					@RequestParam("type") String type)
	{
		
		MediaDataModel model = new MediaDataModel(Integer.parseInt(userid),url,title,description,tags,type);
		
		this.mediaServiceProxy.saveData(model);
		
		this.mediaServiceProxy.save(file);
					}
	

}