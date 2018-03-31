package com.mybookmark.mybookmarkapi.web.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mybookmark.mybookmarkapi.domain.entity.BookmarkEntity;
import com.mybookmark.mybookmarkapi.web.form.CreateBookmarkForm;

@RestController
@RequestMapping(value="/bookmarks")
public class BookmarksController {
	
	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping(method=RequestMethod.GET, value="/{bookmarkId}")
	public BookmarkEntity readBookmark() {
		return new BookmarkEntity(1, "google", "google.com", "google site", null);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<BookmarkEntity> readBookmarks() {
		ArrayList<BookmarkEntity> bookmarks = new ArrayList<>();
		bookmarks.add(new BookmarkEntity(1, "google", "google.com", "google site", null));
		return bookmarks;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public CreateBookmarkForm createBookmark(@RequestBody @Valid CreateBookmarkForm input) {
		return input;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{bookmarkId}")
	public CreateBookmarkForm updateBookmark(@PathVariable String bookmarkId, @RequestBody @Valid CreateBookmarkForm input) {
		return input;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{bookmarkId}")
	public void deleteBookmark(@PathVariable String bookmarkId) {
		System.out.println(bookmarkId);
	}
	
}