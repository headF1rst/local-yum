package com.sanha.localyum.controller;

@org.springframework.web.bind.annotation.RestController()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/sanha/localyum/controller/UserController;", "", "userUseCase", "Lcom/sanha/localyum/user/application/port/in/UserUseCase;", "(Lcom/sanha/localyum/user/application/port/in/UserUseCase;)V", "getUserUseCase", "()Lcom/sanha/localyum/user/application/port/in/UserUseCase;", "findUser", "Lcom/sanha/localyum/support/response/ApiResponse;", "Lcom/sanha/localyum/controller/UserResponse;", "userId", "Ljava/util/UUID;", "local-yum-api"})
public class UserController {
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.user.application.port.in.UserUseCase userUseCase = null;
    
    public UserController(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.user.application.port.in.UserUseCase userUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.sanha.localyum.user.application.port.in.UserUseCase getUserUseCase() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/users/{userId}"})
    @org.jetbrains.annotations.NotNull()
    public com.sanha.localyum.support.response.ApiResponse<com.sanha.localyum.controller.UserResponse> findUser(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.util.UUID userId) {
        return null;
    }
}