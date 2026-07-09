package com.msa4mokhwagram.global.responses;

public record GlobalRes<T>(
        String code
        , String message
        , T data
) {
    public static <T> GlobalRes<T> from(String code, String message, T data) {
        return new GlobalRes<T>(code, message, data);
    }
}
