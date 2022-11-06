package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Comment;

public interface CommentDao {
    Page<Comment> getComment(Pageable pagerequest);

    //Comment findByID(Long id);

    Comment save(Comment comment);
}
