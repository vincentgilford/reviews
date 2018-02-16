package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import static org.hamcrest.Matchers.contains;
import org.junit.Test;

public class ReviewRepositoryTest {
	private ReviewRepository underTest; 
	
	private Review firstReview = new Review (12345L,"Home Alone","www","Movies","stuff");
	private Review secondReview = new Review (12346L, "Planes, Trains, and Automobiles", "rrr","Movies", "things");
	
	@Test
	public void addFirstReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview);
		
		
		Review check = underTest.findReview(firstReview.getId()); 
		
		assertThat(check, is(firstReview));
	}
	
	@Test
	public void addSecondReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview,secondReview);
		
		Review check = underTest.findReview(secondReview.getId());
		
		assertThat(check, is(secondReview));
	}
	
	@Test
	public void shouldFindAll() {
		ReviewRepository underTest = new ReviewRepository(firstReview,secondReview);
		
		Collection<Review> check = underTest.findAllReviews();
		
		assertThat(check, containsInAnyOrder(firstReview,secondReview));
		
		
	}
	
}
