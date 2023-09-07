package com.prodapt.learningspring.entity;


import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String comment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "user_id", referencedColumnName = "id")
	  private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "post_id", referencedColumnName = "id")
	  private Post post;
	
	private Date date;
	
}


