package com.busleiman.kafkadto.model;

import lombok.*;

@Builder
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Order {

    private String orderId;
    private String customerId;
    private String supplierId;
    private String firstName;
    private String lastName;
    private int items;
    private float price;
    private float weight;
    private boolean automatedEmail;
}
