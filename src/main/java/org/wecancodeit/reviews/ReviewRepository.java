package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

		Map<Long,Review> reviews = new HashMap<Long,Review>();
		
		
		
	public ReviewRepository() {
		Review firstReview = new Review(12345L,"Home Alone","www","Movies","stuff");
		addReview(firstReview);
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
