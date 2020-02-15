package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "newsfeed")


public class Newsfeed{

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique key and Auti Increment
	private Integer id;
	
	@Column
	private Integer userId;
	
	
	@Column
	private Integer mediaId;
	
	@Column
	
	private LocalDateTime postedon;
	
	@Column
	private String feed;
	
	@Column
	private LocalDateTime createdon;

	public Newsfeed(Integer id, Integer userId, Integer mediaId, LocalDateTime postedon, String feed,
			LocalDateTime createdon) {
		super();
		this.id = id;
		this.userId = userId;
		this.mediaId = mediaId;
		this.postedon = postedon;
		this.feed = feed;
		this.createdon = createdon;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMediaId() {
		return mediaId;
	}

	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}

	public LocalDateTime getPostedon() {
		return postedon;
	}

	public void setPostedon(LocalDateTime postedon) {
		this.postedon = postedon;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public LocalDateTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	@Override
	public String toString() {
		return "Newsfeed [id=" + id + ", userId=" + userId + ", mediaId=" + mediaId + ", postedon=" + postedon
				+ ", feed=" + feed + ", createdon=" + createdon + "]";
	}
	
	
}
