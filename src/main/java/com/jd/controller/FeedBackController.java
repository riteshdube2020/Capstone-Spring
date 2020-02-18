package com.jd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jd.data.Feedback;
import com.jd.data.IFeedBackDao;

@CrossOrigin
@RestController     
public class FeedBackController {
	
	@Autowired
	private IFeedBackDao feedBackRepo;

	
	@PostMapping(path="/addfeedback")
	public Feedback addFeedBack(@RequestBody Feedback fb) {
		System.out.println("Inside addFeedBack(FeedBack fb)");
		return feedBackRepo.save(fb);	
	}
	
	@GetMapping(path="/sfeedbacks")
	public List<Feedback> getAllFeedBack() {
		System.out.println("Inside getAllFeedBack()");
		return feedBackRepo.findAll();		
	}
	
	@GetMapping(path="/feedbacks/{id}")
	 public Optional<Feedback> getFeedBackById(@PathVariable Integer id) {
		 System.out.println("inside getFeedBackByUserId(int id)");
		 return feedBackRepo.findById(id);		 
	 }
	
	@GetMapping(path="/userfeedbacks/{uid}")
	 public List<Feedback> getFeedBackByUserId(@PathVariable("uid") String userid) {
		 System.out.println("inside getFeedBackByUserId( )" +userid);
		 return feedBackRepo.findByuserid(userid);		 
	 }
	
	@GetMapping(path="/feedbacksrating/{rating}")
	 public List<Feedback> getFeedBackByRatings(@PathVariable Integer rating) {
		 System.out.println("inside getFeedBackByRatings" + rating);
		 return feedBackRepo.findByRating(rating);		 
	 }
	
	@GetMapping(path="/feedbacks/search")
	public List<Feedback> findByUserAndRating(@RequestParam("userid") String userid, @RequestParam("rating") Integer rating) {
		return feedBackRepo.findByUserAndRating(userid, rating);		 
	} 
	
	@DeleteMapping(path="/feedbacks/{id}") 
	public void deleteById(@PathVariable int id) {
		System.out.println("inside delete");
		feedBackRepo.deleteById(id);
		}
	
}
