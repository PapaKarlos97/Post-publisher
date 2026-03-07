package io.vladimirdev.iam_service.services.impl;

import io.vladimirdev.iam_service.model.constants.ApiErrorMessage;
import io.vladimirdev.iam_service.model.dto.post.PostDTO;
import io.vladimirdev.iam_service.model.entities.Post;
import io.vladimirdev.iam_service.model.exception.NotFoundException;
import io.vladimirdev.iam_service.model.response.IamResponse;
import io.vladimirdev.iam_service.repositories.PostRepository;
import io.vladimirdev.iam_service.services.PostService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepo;
    private final List<String> posts=new ArrayList<>();

    @Override
    public IamResponse<PostDTO> getById(@NotNull long postId) {

        Post post= postRepo.findById(postId).orElseThrow(()->new NotFoundException(ApiErrorMessage.POST_NOT_FOUND_BY_ID.getMessage(postId)));
        PostDTO postDTO=PostDTO.builder().id(post.getId())
                .content(post.getContent())
                .title(post.getTitle())
                .likes(post.getLikes())
                .build();
        return IamResponse.createSuccessful(postDTO);
    }

    @Override
    public void createPost(String postContent){
        posts.add(postContent);
    }
}
