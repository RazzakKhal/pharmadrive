package com.pharmadrive.pharmadrive.dtos.toView;

import lombok.Data;


public class AllArticlesDto {
    private Long id;
    private String nameArticle;
    private Double price;
    private Boolean isRefundable;
    private String picture;

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

    public String getPicture(){
        return this.picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }
    public Boolean getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }
}
