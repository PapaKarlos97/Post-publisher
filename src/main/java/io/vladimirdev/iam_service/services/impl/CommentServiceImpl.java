package io.vladimirdev.iam_service.services.impl;

import io.vladimirdev.iam_service.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final List<String>comments=new ArrayList<>();
    @Override
    public void createComment(String commentContent) {
        comments.add(commentContent);
    }
}
