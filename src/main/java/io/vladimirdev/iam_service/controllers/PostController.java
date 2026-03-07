package io.vladimirdev.iam_service.controllers;

import io.vladimirdev.iam_service.model.constants.ApiErrorMessage;
import io.vladimirdev.iam_service.model.constants.ApiLogMessage;
import io.vladimirdev.iam_service.model.dto.post.PostDTO;
import io.vladimirdev.iam_service.model.entities.Post;
import io.vladimirdev.iam_service.model.response.IamResponse;
import io.vladimirdev.iam_service.repositories.PostRepository;
import io.vladimirdev.iam_service.services.PostService;
import io.vladimirdev.iam_service.services.impl.PostServiceImpl;
import io.vladimirdev.iam_service.utils.ApiUtils;
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
    private final PostServiceImpl postService;

    @GetMapping("${end.point.id}")
    public ResponseEntity<IamResponse<PostDTO>>getPostById(@PathVariable(name = "id") long postId){
        log.trace(ApiLogMessage.NAME_OF_CURRENT_METHOD.getValue(), ApiUtils.getMethodName());
        return ResponseEntity.ok(postService.getById(postId));

    }

}
