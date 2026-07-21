package com.msa4mokhwagram.domain.post.repositories;

import com.msa4mokhwagram.domain.post.entities.Post;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.msa4mokhwagram.domain.post.entities.QPost.post;
import static com.msa4mokhwagram.domain.user.entities.QUser.user;

@Repository
@RequiredArgsConstructor
public class PostQueryRepository {
    private final JPAQueryFactory jpaQueryFactory;

    // SELECT
    // *
    // FROM posts
    //    join users
    //      on posts.user_id = users.id
    // WHERE deleted_at IS NULL
    // ORDER BY created_at desc, id asc
    // LIMIT ? OFFSET ?
    public List<Post> pagination(int offset, int limit) {
        return jpaQueryFactory
            .selectFrom(post)
            .join(post.user, user).fetchJoin()
            .orderBy(post.createdAt.desc(), post.id.desc())
            .limit(limit)
            .offset(offset)
            .fetch();
    }
}

