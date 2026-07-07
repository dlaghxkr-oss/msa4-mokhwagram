package com.msa4mokhwagram.domain.post.repositories;

import com.msa4mokhwagram.domain.post.entities.Post;
import com.msa4mokhwagram.domain.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    long countByUser(User user);

    List<Post> user(User user);
}
