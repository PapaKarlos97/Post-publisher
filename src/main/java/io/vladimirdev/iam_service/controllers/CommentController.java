package io.vladimirdev.iam_service.controllers;

import io.vladimirdev.iam_service.services.CommentService;
import io.vladimirdev.iam_service.services.impl.CommentServiceImpl;
import io.vladimirdev.iam_service.services.impl.SecondCommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private CommentService commentService;

@Autowired
    public void setCommentService(CommentServiceImpl commentService){
        this.commentService=commentService;
    }

    @PostMapping("/create")
    public ResponseEntity<String>createComment(@RequestBody Map<String, String>requestBody){
        String content=requestBody.get("content");
        commentService.createComment(content);
        return new ResponseEntity<>("Comment added: "+content, HttpStatus.OK);
    }
    @PostMapping("/createComment")
    public ResponseEntity<String>createCommentWithTime(@RequestBody Map<String, String>requestBody){
    this.commentService= new SecondCommentServiceImpl();
        String content=requestBody.get("content");
        commentService.createComment(content);
        return new ResponseEntity<>("Comment withTime added: "+content, HttpStatus.OK);
    }
}
