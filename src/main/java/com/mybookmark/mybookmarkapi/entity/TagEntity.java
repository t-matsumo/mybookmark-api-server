package com.mybookmark.mybookmarkapi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TagEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tagId;
	
	@Column(length = 20)
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "tags")
	private List<BookmarkEntity> bookmarks;
	
	private TagEntity() {
		
	}
	
	public TagEntity(long tagId, String name) {
		this.tagId = tagId;
		this.name = name;
	}

	public long getTagId() {
		return tagId;
	}

	
	public String getName() {
		return name;
	}

	public List<BookmarkEntity> getBookmarks() {
		return bookmarks;
	}	
	
	
}