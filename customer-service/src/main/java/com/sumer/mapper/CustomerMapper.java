package com.sumer.mapper;

import com.sumer.dto.CustomerRequest;
import com.sumer.dto.CustomerResponse;
import com.sumer.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toCustomer(CustomerRequest request) {
        if (request == null) {
            return null;
        }
        return Customer.builder()
                .id(request.id())
                .address(request.address())
                .customerName(request.customerName())
                .email(request.email())
                .creditCardInfo(request.creditCardInfo())
                .shippingInfo(request.shippingInfo())
                .accountBalance(request.accountBalance())
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        return new CustomerResponse(
                customer.getId(),
                customer.getCustomerName(),
                customer.getAddress(),
                customer.getEmail(),
                customer.getCreditCardInfo(),
                customer.getShippingInfo(),
                customer.getAccountBalance()
        );
    }
}
