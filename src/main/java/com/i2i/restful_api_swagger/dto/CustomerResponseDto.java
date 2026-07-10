package com.i2i.restful_api_swagger.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Response body for customer data")
public class CustomerResponseDto {

    @Schema(description = "Unique identifier of the customer")
    private Long id;

    @Schema(description = "Full name of the customer")
    private String name;

    @Schema(description = "Email address")
    private String email;

    @Schema(description = "Phone number")
    private String phone;
}