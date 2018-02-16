package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviews = new ReviewRepository();
	
	@RequestMapping("reviews")
	public String showReviews(Model model) {
		model.addAttribute("reviews", reviews.findAllReviews());//what will be iterated over
		return "reviews-repository";
	}
	
	
}
