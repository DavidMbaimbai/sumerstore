package com.sumer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
    Long id,
    @NotNull(message = "Customer firstname is required")
    String customerName,
    String address,
    @NotNull(message = "Customer Email is required")
    @Email(message = "Customer Email is not a valid email address")
    String email,
    String creditCardInfo,
    String shippingInfo,
    Float accountBalance

) {

}
