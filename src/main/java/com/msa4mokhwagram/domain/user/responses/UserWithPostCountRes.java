package com.msa4mokhwagram.domain.user.responses;

import com.msa4mokhwagram.domain.user.entities.User;

public record UserWithPostCountRes(
    UserRes user
     ,long countPosts
) {
    public static UserWithPostCountRes from(User user, long countPosts) {
        return new UserWithPostCountRes(
            UserRes.from(user)
            ,  countPosts
        );
    }
}
