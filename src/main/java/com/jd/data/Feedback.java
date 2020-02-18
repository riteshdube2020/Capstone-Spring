package com.jd.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback implements Serializable {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String userid;
	String source;
	String title;
	String review;
	Integer rating;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(Integer id, String userid, String source, String title, String review, Integer rating) {
		super();
		this.id = id;
		this.userid = userid;
		this.source = source;
		this.title = title;
		this.review = review;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", userid=" + userid + ", source=" + source + ", title=" + title + ", review="
				+ review + ", rating=" + rating + "]";
	}
}

	