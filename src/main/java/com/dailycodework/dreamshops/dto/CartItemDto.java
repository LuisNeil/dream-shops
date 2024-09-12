package com.dailycodework.dreamshops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private Long productId;
    private int quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
