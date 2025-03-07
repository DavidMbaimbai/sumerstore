package com.sumer.ecommerce.kafka;



import com.sumer.ecommerce.entity.CustomerResponse;
import com.sumer.ecommerce.order.PaymentMethod;
import com.sumer.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
