package org.wecancodeit.reviews;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class ReviewsTest {
	Review underTest;
	
	
//	@Before
//	public void setup() {
//		underTest = new Review ();
//		
//	}
	
	
	
	@Test
	public void reviewsObjectConstructorIdParameter() {
		Long id = 12345L;
		String title = null;
		String imageUrl = null;
		String reviewCategory = null;
		String content = null; 
		
		underTest = new Review(id, title, imageUrl, reviewCategory, content);
		
		Long check = underTest.getId();
		
		
		assertTrue(check instanceof Long);
	}
	
	@Test
	public void reviewsObjectConstructorTitleParameter() {
		Long id = 12345L;
		String title = "Home Alone";
		String imageUrl = null;
		String reviewCategory = null;
		String content = null; 
		
		underTest = new Review(id, title, imageUrl, reviewCategory, content);
		
		String check = underTest.getTitle();
		
		
		assertTrue(check instanceof String);
	}
	
	@Test
	public void reviewsObjectConstructorimageUrlParameter() {
		Long id = 12345L;
		String title = "Home Alone";
		String imageUrl = "www.";
		String reviewCategory = null;
		String content = null; 
		
		underTest = new Review(id, title, imageUrl, reviewCategory, content);
		
		String check = underTest.getImageUrl();
		
		
		assertTrue(check instanceof String);
	}
	@Test
	public void reviewsObjectConstructorReviewCategoryParameter() {
		Long id = 12345L;
		String title = "Home Alone";
		String imageUrl = "www.";
		String reviewCategory = "Movies";
		String content = null; 
		
		underTest = new Review(id, title, imageUrl, reviewCategory, content);
		
		String check = underTest.getReviewCategory();
		
		
		assertTrue(check instanceof String);
	}
	
	@Test
	public void reviewsObjectConstructorContentCategoryParameter() {
		Long id = 12345L;
		String title = "Home Alone";
		String imageUrl = "www.";
		String reviewCategory = "Movies";
		String content = "stuff"; 
		
		underTest = new Review(id, title, imageUrl, reviewCategory, content);
		
		String check = underTest.getContent();
		
		assertTrue(check instanceof String);
	}
	
	
	
	
	
	
}
