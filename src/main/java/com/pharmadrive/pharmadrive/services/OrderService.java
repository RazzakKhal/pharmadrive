package com.pharmadrive.pharmadrive.services;

import com.pharmadrive.pharmadrive.dtos.fromView.ArticleChoosenDto;
import com.pharmadrive.pharmadrive.dtos.fromView.ArticleChoosenDtoList;
import com.pharmadrive.pharmadrive.dtos.toView.OrderDto;
import org.springframework.security.core.Authentication;

public interface OrderService {

    OrderDto createAnOrder(ArticleChoosenDtoList articleChoosenDtoList, Authentication authentication);
}
