package io.vladimirdev.iam_service.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data@Entity@Table(name = "posts")
public class Post {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false,length = 500)
    private String content;
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt=LocalDateTime.now();
    @Column(nullable = false)
    private int likes=0;
}
