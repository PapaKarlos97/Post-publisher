package io.vladimirdev.iam_service.repositories;

import io.vladimirdev.iam_service.model.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
