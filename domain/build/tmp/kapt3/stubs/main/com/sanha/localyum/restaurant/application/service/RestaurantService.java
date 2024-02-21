package com.sanha.localyum.restaurant.application.service;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sanha/localyum/restaurant/application/service/RestaurantService;", "Lcom/sanha/localyum/restaurant/application/port/in/RestaurantUseCase;", "restaurantAppender", "Lcom/sanha/localyum/restaurant/application/service/RestaurantAppender;", "(Lcom/sanha/localyum/restaurant/application/service/RestaurantAppender;)V", "register", "", "restaurant", "Lcom/sanha/localyum/restaurant/domain/Restaurant;", "domain"})
public class RestaurantService implements com.sanha.localyum.restaurant.application.port.in.RestaurantUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.restaurant.application.service.RestaurantAppender restaurantAppender = null;
    
    public RestaurantService(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.restaurant.application.service.RestaurantAppender restaurantAppender) {
        super();
    }
    
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.restaurant.domain.Restaurant restaurant) {
    }
}