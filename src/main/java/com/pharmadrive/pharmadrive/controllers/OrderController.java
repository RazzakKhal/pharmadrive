package com.pharmadrive.pharmadrive.controllers;

import com.pharmadrive.pharmadrive.dtos.fromView.ArticleChoosenDto;
import com.pharmadrive.pharmadrive.dtos.fromView.ArticleChoosenDtoList;
import com.pharmadrive.pharmadrive.dtos.toView.OrderDto;
import com.pharmadrive.pharmadrive.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/commande")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("")
    public OrderDto createAnOrder(@RequestBody ArticleChoosenDtoList articleChoosenDtoList, Authentication authentication){

        return orderService.createAnOrder(articleChoosenDtoList, authentication);
    }
}
