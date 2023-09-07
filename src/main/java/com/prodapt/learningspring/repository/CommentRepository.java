package com.prodapt.learningspring.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prodapt.learningspring.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
	List<Comment> findByPostId(long id);
}
