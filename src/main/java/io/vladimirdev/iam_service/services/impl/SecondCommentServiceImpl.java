package io.vladimirdev.iam_service.services.impl;

import io.vladimirdev.iam_service.services.CommentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service("secondCommentService")
public class SecondCommentServiceImpl implements CommentService {

    private final List<String>comments=new ArrayList<>();
    @Override
    public void createComment(String commentContent) {
        String commentWithTime="["+ LocalDateTime.now()+"]"+commentContent;
        comments.add(commentWithTime);
        System.out.println(commentWithTime);
    }
}
