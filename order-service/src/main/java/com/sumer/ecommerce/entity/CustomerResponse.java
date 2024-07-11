package com.sumer.ecommerce.entity;

public record CustomerResponse(
    Long id,
    String firstname,
    String lastname,
    String email
) {

}
