package com.pharmadrive.pharmadrive.dtos.toView;

import java.time.Instant;

public class PrescriptionDto {

    private Long id;
    private String imageOrdonnance;

    public PrescriptionDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageOrdonnance() {
        return imageOrdonnance;
    }

    public void setImageOrdonnance(String imageOrdonnance) {
        this.imageOrdonnance = imageOrdonnance;
    }
}
