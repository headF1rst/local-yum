package com.sanha.localyum.controller;

@org.springframework.web.bind.annotation.RestController()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sanha/localyum/controller/RestaurantController;", "", "restaurantUseCase", "Lcom/sanha/localyum/restaurant/application/port/in/RestaurantUseCase;", "(Lcom/sanha/localyum/restaurant/application/port/in/RestaurantUseCase;)V", "register", "", "request", "Lcom/sanha/localyum/controller/RestaurantRegisterRequest;", "local-yum-api"})
public class RestaurantController {
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.restaurant.application.port.in.RestaurantUseCase restaurantUseCase = null;
    
    public RestaurantController(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.restaurant.application.port.in.RestaurantUseCase restaurantUseCase) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/restaurant"})
    public void register(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.sanha.localyum.controller.RestaurantRegisterRequest request) {
    }
}