package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "John Doe"
    )
    @NotEmpty(message="Name should not be empty")
    @Size(min = 5,max = 30, message = "Name should have at least 5 characters, at most 30 characters")
    private String name;


    @Schema(
            description = "Email of the customer", example = "salah@example.com"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid value")
    private String email;


    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    @NotEmpty(message = "Mobile number should not be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
