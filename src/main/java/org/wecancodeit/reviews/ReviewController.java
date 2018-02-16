package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviews = new ReviewRepository();
	
	@RequestMapping("reviews")//local host
	public String showReviews(Model model) {
		model.addAttribute("reviews", reviews.findAllReviews());//what will be iterated over
		return "reviews-repository";
	}
	
	@RequestMapping("review")
	public String showIndivualReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviews",reviews.findReview(id));
		return "review";
	}
	
	
	
}
