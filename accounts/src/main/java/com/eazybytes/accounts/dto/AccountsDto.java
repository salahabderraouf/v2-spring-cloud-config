package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name="Accounts",
        description = "Account details of the customer"
)
public class AccountsDto {
    @Schema(
            description = "Account number of the customer",
            example = "1234567890"
    )
    @NotEmpty(message = "Account Number should not be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Account number should be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the customer",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type should not be empty")
    private String accountType;

    @Schema(
            description = "Branch address of the customer",
            example = "123 Main Street, New York"
    )
    @NotEmpty(message = "Branch Address should not be empty")
    private String branchAddress;
}
