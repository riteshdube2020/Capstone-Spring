package com.jd.data;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IFeedBackDao extends JpaRepository<Feedback,Integer>{

	
//	Optional<FeedBack> findById (Integer id);
	//Optional<FeedBack> findOne(String userId);
	
	List<Feedback> findByuserid(String userid);
	List<Feedback> findByRating(Integer rating);
	
	@Query("select e from Feedback e where e.userid = :userid and e.rating = :rating") 
	List<Feedback> findByUserAndRating(String userid, int rating);
	
}
