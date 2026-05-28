package com.msa4mokhwagram.domain.auth.responses;

import com.msa4mokhwagram.domain.user.responses.UserRes;
import lombok.Builder;

@Builder
public record AuthRes(
    UserRes user
    ,String accessToken
) {

}
