package com.sanha.localyum.support.response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB\'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/sanha/localyum/support/response/ApiResponse;", "T", "", "result", "Lcom/sanha/localyum/support/response/ResultType;", "data", "error", "Lcom/sanha/localyum/support/error/ErrorMessage;", "(Lcom/sanha/localyum/support/response/ResultType;Ljava/lang/Object;Lcom/sanha/localyum/support/error/ErrorMessage;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/sanha/localyum/support/error/ErrorMessage;", "getResult", "()Lcom/sanha/localyum/support/response/ResultType;", "component1", "component2", "component3", "copy", "(Lcom/sanha/localyum/support/response/ResultType;Ljava/lang/Object;Lcom/sanha/localyum/support/error/ErrorMessage;)Lcom/sanha/localyum/support/response/ApiResponse;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "local-yum-api"})
public final class ApiResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.support.response.ResultType result = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final com.sanha.localyum.support.error.ErrorMessage error = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sanha.localyum.support.response.ApiResponse.Companion Companion = null;
    
    private ApiResponse(com.sanha.localyum.support.response.ResultType result, T data, com.sanha.localyum.support.error.ErrorMessage error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.support.response.ResultType getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sanha.localyum.support.error.ErrorMessage getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.support.response.ResultType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sanha.localyum.support.error.ErrorMessage component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.support.response.ApiResponse<T> copy(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.support.response.ResultType result, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    com.sanha.localyum.support.error.ErrorMessage error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0003\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/sanha/localyum/support/response/ApiResponse$Companion;", "", "()V", "error", "Lcom/sanha/localyum/support/response/ApiResponse;", "S", "Lcom/sanha/localyum/support/error/ErrorType;", "errorData", "success", "data", "(Ljava/lang/Object;)Lcom/sanha/localyum/support/response/ApiResponse;", "local-yum-api"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sanha.localyum.support.response.ApiResponse<java.lang.Object> success() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <S extends java.lang.Object>com.sanha.localyum.support.response.ApiResponse<S> success(S data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <S extends java.lang.Object>com.sanha.localyum.support.response.ApiResponse<S> error(@org.jetbrains.annotations.NotNull()
        com.sanha.localyum.support.error.ErrorType error, @org.jetbrains.annotations.Nullable()
        java.lang.Object errorData) {
            return null;
        }
    }
}