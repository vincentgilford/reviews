package org.wecancodeit.reviews;

import java.util.Collection;

public class Review {

	private Long id;
	private String title;
	private String imageUrl;
	private String reviewCategory;
	private String content;
	private Collection<String> tags;

	public Review(Long id, String title, String imageUrl, String reviewCategory, String content) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.content = content;
		
	}

	public Review  (Long id, String title, String imageUrl, String reviewCategory, String content, Collection<String> tags) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.content  = content;
		this.tags = tags;
		
	}

	public Collection<String> getTags() {
		return tags;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public String getImageUrl() {
		// TODO Auto-generated method stub
		return imageUrl;
	}

	public String getReviewCategory() {
		// TODO Auto-generated method stub
		return reviewCategory;
	}

	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	
}
