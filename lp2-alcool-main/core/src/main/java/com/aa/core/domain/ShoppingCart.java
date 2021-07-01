package com.aa.core.domain;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ShoppingCart {
    private String id;
    private Double amount;
    private LocalDateTime date;
    private String requestNumber;
    private List<PurchaseItems> listPurchaseItems;
}
