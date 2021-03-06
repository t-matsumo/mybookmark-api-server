package com.mybookmark.mybookmarkapi.web.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateBookmarkForm extends FormBean {
	
	@NotBlank
	@Size(max=100)
	private String title;

	@NotBlank
	@Size(max=300)
	private String url;
	
	@Size(max=300)
	private String overview;
		
	private long[] tags;

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public String getOverview() {
		return overview;
	}

	public long[] getTags() {
		return tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public void setTags(long[] tags) {
		this.tags = tags;
	}
	
}
