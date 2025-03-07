package com.sumer.ecommerce.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(
    name = "entity-service",
    url = "${application.config.customer-url}"
)
public interface CustomerClient {

  @GetMapping("/{customer-id}")
  Optional<CustomerResponse> findCustomerById(@PathVariable("customer-id") String customerId);
}
