package dev.oguzhanercelik.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorEnum {

    UNEXPECTED_ERROR(1000, "unexpected.error", HttpStatus.INTERNAL_SERVER_ERROR),
    VALIDATION_ERROR(1001, "validation.error", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED(1002, "auth.header.not.valid", HttpStatus.UNAUTHORIZED);

    private final int code;
    private final String key;
    private final HttpStatus status;
}