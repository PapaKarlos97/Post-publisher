package io.vladimirdev.iam_service.services.impl;

import io.vladimirdev.iam_service.services.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final List<String> posts=new ArrayList<>();

    @Override
    public void createPost(String postContent){
        posts.add(postContent);
    }
}
