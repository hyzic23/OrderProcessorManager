package com.beta.orderprocessingservice.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record CreateOrderItemDto(
        @NotNull Long productId,
        @Min(1) @Max(100) Integer quantity
) {}
