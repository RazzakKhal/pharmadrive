package com.pharmadrive.pharmadrive.dtos.fromView;

import lombok.Data;

@Data
public class ArticleChoosenDto {

    private String name;

    private Integer quantity;

    private Double unitPrice;

    private Double totalPrice;

}
