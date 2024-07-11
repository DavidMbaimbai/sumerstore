package com.sumer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Customer {

  @Id
  private Long id;
  private String address;
  private String customerName;
  private String email;
  private String creditCardInfo;
  private String shippingInfo;
  private Float accountBalance;
}
