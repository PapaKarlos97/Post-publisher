package io.vladimirdev.iam_service.controllers;

import io.vladimirdev.iam_service.model.constants.ApiErrorMessage;
import io.vladimirdev.iam_service.model.constants.ApiLogMessage;
import io.vladimirdev.iam_service.model.entities.Post;
import io.vladimirdev.iam_service.repositories.PostRepository;
import io.vladimirdev.iam_service.services.impl.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@Slf4j
@RestController
@RequestMapping("${end.point.posts}")
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepo;

    @GetMapping("${end.point.id}")
    public ResponseEntity<Post>getPostById(@PathVariable(name = "id") long postId){
        log.info(ApiLogMessage.POST_INFO_BY_ID.getMessage(postId));
        return postRepo.findById(postId)
                .map(ResponseEntity::ok)
                .orElseGet(()->{
                    log.info(ApiErrorMessage.POST_NOT_FOUND_BY_ID.getMessage(postId));
                    return ResponseEntity.notFound().build();
                });
    }


}
