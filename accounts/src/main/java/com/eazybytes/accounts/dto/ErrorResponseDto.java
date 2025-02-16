package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(
        name="ErrorResponse",
        description = "Schema to hold the error response information"
)
public class ErrorResponseDto {
    @Schema(
            description = "API path of the request",
            example = "/accounts"
    )
    private String apiPath;

    @Schema(
            description = "HTTP status code of the response",
            example="500"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message of the response",
            example="Internal Server Error"
    )
    private String errorMessage;

    @Schema(
            description = "Timestamp of the error",
            example="2022-01-01T00:00:00"
    )
    private LocalDateTime errorTime;
}
