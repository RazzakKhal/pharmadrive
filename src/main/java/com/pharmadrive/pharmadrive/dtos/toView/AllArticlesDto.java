package com.pharmadrive.pharmadrive.dtos.toView;

public class AllArticlesDto {
    private Long id;
    private String nameArticle;
    private Double price;
    private Boolean isRefundable;

    // Getters and Setters
    public Long getIdArticle() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }
}
