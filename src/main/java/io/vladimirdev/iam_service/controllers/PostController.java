package io.vladimirdev.iam_service.controllers;

import io.vladimirdev.iam_service.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostServiceImpl postService;

@Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createPost(@RequestBody Map<String, String> requestBody){
    String title=requestBody.get("title");
    String content= requestBody.get("content");

    String postContent="Title: "+title+"\nContent:"+content+'\n';
    postService.createPost(postContent);
    return new ResponseEntity<>("Post created:"+title, HttpStatus.OK);
    }
}
