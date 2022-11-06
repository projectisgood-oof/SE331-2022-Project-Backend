package se331.rest.service;

import se331.rest.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComment();

    Comment save(Comment comment);
}
