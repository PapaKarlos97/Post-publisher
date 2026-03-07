package io.vladimirdev.iam_service.services;

import io.vladimirdev.iam_service.model.dto.post.PostDTO;
import io.vladimirdev.iam_service.model.response.IamResponse;
import jakarta.validation.constraints.NotNull;

public interface PostService {
    IamResponse<PostDTO>getById(@NotNull long postId);
    void createPost(String postContent);
}
