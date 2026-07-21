package com.msa4mokhwagram.domain.post.controller;

import com.msa4mokhwagram.domain.post.requests.PostIndexReq;
import com.msa4mokhwagram.domain.post.responses.PostIndexRes;
import com.msa4mokhwagram.domain.post.responses.PostWithUserRes;
import com.msa4mokhwagram.domain.post.services.PostService;
import com.msa4mokhwagram.global.config.openapi.CustomApiResponse;
import com.msa4mokhwagram.global.responses.GlobalRes;
import com.msa4mokhwagram.global.responses.constant.CustomResponseCode;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "게시글 관련 API", description = "게시글 관련")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    @Operation(summary = "게시글 목록 조회 처리")
    @CustomApiResponse(value = {
            CustomResponseCode.INVALID_PARAMETER_ERROR
            ,CustomResponseCode.INVALID_TOKEN_ERROR
            ,CustomResponseCode.UNAUTHENTICATED_ERROR
            ,CustomResponseCode.FILE_MANAGED_ERROR
            ,CustomResponseCode.SYSTEM_ERROR
    })
    @GetMapping("/posts")
    public ResponseEntity<GlobalRes<PostIndexRes>> index(PostIndexReq postIndexReq) {
        return ResponseEntity.ok(GlobalRes.success(postService.index(postIndexReq)));
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<GlobalRes<PostWithUserRes>> show(
        @Parameter(description = "게시글 번호", example = "1") @Min(value = 1, message = "1이상 숫자만 허용합니다.") @PathVariable long id
    ) {
      return ResponseEntity.ok(GlobalRes.success(postService.show(id)));
    }
}