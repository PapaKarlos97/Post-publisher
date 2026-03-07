package io.vladimirdev.iam_service.model.dto.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class PostDTO implements Serializable {
    private long id;
    private String title;
    private String content;
    private int likes;
}
