package com.msa4mokhwagram.domain.post.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PostStoreReq(
    @NotBlank(message = "내용은 필수 항목입니다.")
    @Size(max = 200, message = "내용은 200자 이내로 입력해 주세요.")
    String content,

    @NotBlank(message = "이미지는 필수 항목입니다.")
    @Size(max = 100, message = "이미지 경로가 올바르지 않습니다.")
    String image
) {
}
