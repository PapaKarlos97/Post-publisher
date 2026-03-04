package io.vladimirdev.iam_service.controllers;

import io.vladimirdev.iam_service.services.CommentService;
import io.vladimirdev.iam_service.services.impl.SecondCommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService defaultCommentService;
    private final CommentService advancedCommentService;

    public CommentController(CommentService defaultCommentService,
                             @Qualifier("secondCommentService") CommentService advancedCommentService) {
        this.defaultCommentService = defaultCommentService;
        this.advancedCommentService = advancedCommentService;
    }


    @PostMapping("/createDefault")
    public ResponseEntity<String>createComment(@RequestBody Map<String, String>requestBody){
        String content=requestBody.get("content");
        defaultCommentService.createComment(content);
        return new ResponseEntity<>("Default comment added: "+content, HttpStatus.OK);
    }

    @PostMapping("/createComment")
    public ResponseEntity<String>createCommentWithTime(@RequestBody Map<String, String>requestBody){
//    this.defaultCommentService = new SecondCommentServiceImpl();
        String content=requestBody.get("content");
        advancedCommentService.createComment(content);
        return new ResponseEntity<>("Advanced comment added: "+content, HttpStatus.OK);
    }
}
