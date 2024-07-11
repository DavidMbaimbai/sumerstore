package com.sumer.service;


import com.sumer.dto.CustomerRequest;
import com.sumer.dto.CustomerResponse;
import com.sumer.entity.Customer;
import com.sumer.exception.CustomerNotFoundException;
import com.sumer.mapper.CustomerMapper;
import com.sumer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final CustomerRepository repository;
  private final CustomerMapper mapper;

  public Long createCustomer(CustomerRequest request) {
    var customer = this.repository.save(mapper.toCustomer(request));
    return customer.getId();
  }

  public void updateCustomer(CustomerRequest request) {
    var customer = this.repository.findById(request.id())
        .orElseThrow(() -> new CustomerNotFoundException(
            String.format("Cannot update entity:: No entity found with the provided ID: %s", request.id())
        ));
    mergeCustomer(customer, request);
    this.repository.save(customer);
  }

  private void mergeCustomer(Customer customer, CustomerRequest request) {
    if (StringUtils.isNotBlank(request.customerName())) {
      customer.setCustomerName(request.customerName());
    }
    if (StringUtils.isNotBlank(request.email())) {
      customer.setEmail(request.email());
    }
    if (request.address() != null) {
      customer.setAddress(request.address());
    }
  }

  public List<CustomerResponse> findAllCustomers() {
    return  this.repository.findAll()
        .stream()
        .map(this.mapper::fromCustomer)
        .collect(Collectors.toList());
  }

  public CustomerResponse findById(Long id) {
    return this.repository.findById(id)
        .map(mapper::fromCustomer)
        .orElseThrow(() -> new CustomerNotFoundException(String.format("No entity found with the provided ID: %s", id)));
  }

  public boolean existsById(Long id) {
    return this.repository.findById(id)
        .isPresent();
  }

  public void deleteCustomer(Long id) {
    this.repository.deleteById(id);
  }
}
