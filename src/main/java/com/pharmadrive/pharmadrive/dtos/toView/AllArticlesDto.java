package com.pharmadrive.pharmadrive.dtos.toView;

import lombok.Data;

@Data
public class AllArticlesDto {
    private Long id;
    private String nameArticle;
    private Double price;
    private Boolean isRefundable;
    private String picture;

}
