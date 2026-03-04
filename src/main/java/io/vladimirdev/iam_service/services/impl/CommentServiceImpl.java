package io.vladimirdev.iam_service.services.impl;

import io.vladimirdev.iam_service.services.CommentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service@Primary
public class CommentServiceImpl implements CommentService {

    private final List<String>comments=new ArrayList<>();
    @Override
    public void createComment(String commentContent) {
        comments.add(commentContent);
        System.out.println("Default comment added: "+commentContent);
    }
}
