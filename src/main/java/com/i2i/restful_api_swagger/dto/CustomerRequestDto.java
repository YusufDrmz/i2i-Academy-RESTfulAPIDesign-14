package com.i2i.restful_api_swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Request body for creating or updating a customer")
public class CustomerRequestDto {

    @Schema(description = "Full name of the customer", example = "John Doe")
    private String name;

    @Schema(description = "Email address", example = "john@example.com")
    private String email;

    @Schema(description = "Phone number", example = "+905551234567")
    private String phone;
}