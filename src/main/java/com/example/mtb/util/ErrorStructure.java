package com.example.mtb.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorStructure<T> {
    private int statusCode;
    @JsonProperty(namespace = "error_message")
    private String errorMessage;

}
