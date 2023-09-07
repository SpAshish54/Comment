package com.prodapt.learningspring.controller.binding;

import lombok.Data;

@Data
public class AddCommentForm {
	private int userId;
	private String comment;
	
}

