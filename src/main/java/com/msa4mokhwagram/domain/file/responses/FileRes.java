package com.msa4mokhwagram.domain.file.responses;

import lombok.Builder;

@Builder
public record FileRes(
    String fileUri
) {
}
