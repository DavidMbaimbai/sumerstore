package com.sumer.ecommerce.payment;


import com.sumer.ecommerce.entity.CustomerResponse;
import com.sumer.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
