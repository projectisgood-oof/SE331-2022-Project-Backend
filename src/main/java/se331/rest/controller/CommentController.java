package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se331.rest.entity.Comment;
import se331.rest.service.CommentService;
import se331.rest.util.LabMapper2;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/comments")
    ResponseEntity<?> getDoctors() {
        return ResponseEntity.ok(LabMapper2.INSTANCE.getCommentDTO(commentService.getAllComment()));
    }

    @GetMapping("/comments/{id}")
    public ResponseEntity<?> getEvent(@PathVariable("id") Long id) {
        Comment output = commentService.getComment(id);
        if (output != null) {
            return ResponseEntity.ok(LabMapper2.INSTANCE.getCommentDTO(output));
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The given id is not found");
        }
    }

    @PostMapping("/addComment")
    public ResponseEntity<?> addComment(@RequestBody Comment comment) {
        Comment output = commentService.save(comment);
        return ResponseEntity.ok(LabMapper2.INSTANCE.getCommentDTO(output));
    }
}