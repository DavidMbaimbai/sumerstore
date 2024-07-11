package com.sumer.dto;

public record CustomerResponse(
        Long id,
        String customerName,
        String address,
        String email,
        String creditCardInfo,
        String shippingInfo,
        Float accountBalance
) {

}
