package com.sanha.localyum.user.application.service;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sanha/localyum/user/application/service/UserReader;", "", "userPot", "Lcom/sanha/localyum/user/application/port/out/UserPort;", "(Lcom/sanha/localyum/user/application/port/out/UserPort;)V", "read", "Lcom/sanha/localyum/user/domain/User;", "id", "Ljava/util/UUID;", "domain"})
public class UserReader {
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.user.application.port.out.UserPort userPot = null;
    
    public UserReader(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.user.application.port.out.UserPort userPot) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.sanha.localyum.user.domain.User read(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
}