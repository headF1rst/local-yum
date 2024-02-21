package com.sanha.localyum.support.error;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/sanha/localyum/support/error/ErrorType;", "", "status", "Lorg/springframework/http/HttpStatus;", "code", "Lcom/sanha/localyum/support/error/ErrorCode;", "message", "", "logLevel", "Lorg/springframework/boot/logging/LogLevel;", "(Ljava/lang/String;ILorg/springframework/http/HttpStatus;Lcom/sanha/localyum/support/error/ErrorCode;Ljava/lang/String;Lorg/springframework/boot/logging/LogLevel;)V", "getCode", "()Lcom/sanha/localyum/support/error/ErrorCode;", "getLogLevel", "()Lorg/springframework/boot/logging/LogLevel;", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lorg/springframework/http/HttpStatus;", "DEFAULT_ERROR", "local-yum-api"})
public enum ErrorType {
    /*public static final*/ DEFAULT_ERROR /* = new DEFAULT_ERROR(null, null, null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.http.HttpStatus status = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.support.error.ErrorCode code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.boot.logging.LogLevel logLevel = null;
    
    ErrorType(org.springframework.http.HttpStatus status, com.sanha.localyum.support.error.ErrorCode code, java.lang.String message, org.springframework.boot.logging.LogLevel logLevel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.http.HttpStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.support.error.ErrorCode getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.boot.logging.LogLevel getLogLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.sanha.localyum.support.error.ErrorType> getEntries() {
        return null;
    }
}