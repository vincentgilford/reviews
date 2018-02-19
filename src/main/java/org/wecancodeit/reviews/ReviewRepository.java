package org.wecancodeit.reviews;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

		Map<Long,Review> reviews = new HashMap<Long,Review>();
		
		
		
	public ReviewRepository() {
		Review firstReview = new Review(12345L,"Home Alone","/images/homeAlone.jpg","Movies","clasic movie we grew up on",Arrays.asList("Comedy", "Family", "Child Star"));
		Review secondReview = new Review(12346L,"Planes, Trains, and Automobiles","/images/planestrains.jpg","Movies","great movie for the holidays",Arrays.asList("Comedy", "Family", "Holidays"));
		Review thirdReview = new Review(12347L,"A Christmas Story","/images/farkus-1280x720.jpg","Movies","one word....F-R-A-G-I-L-E",Arrays.asList("Comedy", "Family", "Child Star")); 
		
		addReview(firstReview,secondReview,thirdReview);
	}
	
	
	public ReviewRepository(Review...review) {
		
		addReview(review);
	}

	public void addReview(Review... reviews) {
		for (Review object : reviews) {
			this.reviews.put(object.getId(), object);	
		}
		
	}
	
	public Review findReview(Long id) {
		// TODO Auto-generated method stub
		return reviews.get(id);
	}

	public Collection<Review> findAllReviews() {
		// TODO Auto-generated method stub
		return reviews.values();
	}
	
	
	
}
