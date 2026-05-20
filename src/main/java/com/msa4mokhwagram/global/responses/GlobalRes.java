package com.msa4mokhwagram.global.responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GlobalRes<T> {
    private String code;
    private String message;
    private T data;
}
