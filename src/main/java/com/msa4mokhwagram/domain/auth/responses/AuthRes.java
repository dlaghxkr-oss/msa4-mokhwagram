package com.msa4mokhwagram.domain.auth.responses;

import com.msa4mokhwagram.domain.user.entities.User;
import lombok.Builder;

@Builder
public record AuthRes(
    User user
    ,String accessToken
) {

}
