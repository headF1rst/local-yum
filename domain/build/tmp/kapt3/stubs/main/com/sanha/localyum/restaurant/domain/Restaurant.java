package com.sanha.localyum.restaurant.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\u0016\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b \u0010\u0016JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006*"}, d2 = {"Lcom/sanha/localyum/restaurant/domain/Restaurant;", "", "id", "Ljava/util/UUID;", "name", "", "category", "Lcom/sanha/localyum/restaurant/domain/Category;", "address", "Lcom/sanha/localyum/restaurant/domain/Address;", "link", "Lcom/sanha/localyum/restaurant/domain/Url;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/sanha/localyum/restaurant/domain/Category;Lcom/sanha/localyum/restaurant/domain/Address;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAddress", "()Lcom/sanha/localyum/restaurant/domain/Address;", "setAddress", "(Lcom/sanha/localyum/restaurant/domain/Address;)V", "getCategory", "()Lcom/sanha/localyum/restaurant/domain/Category;", "getId", "()Ljava/util/UUID;", "getLink-PJ7xaO0", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component5-PJ7xaO0", "copy", "copy-ytZoUok", "(Ljava/util/UUID;Ljava/lang/String;Lcom/sanha/localyum/restaurant/domain/Category;Lcom/sanha/localyum/restaurant/domain/Address;Ljava/lang/String;)Lcom/sanha/localyum/restaurant/domain/Restaurant;", "equals", "", "other", "hashCode", "", "toString", "domain"})
public final class Restaurant {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private final com.sanha.localyum.restaurant.domain.Category category = null;
    @org.jetbrains.annotations.NotNull()
    private com.sanha.localyum.restaurant.domain.Address address;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String link = null;
    
    private Restaurant(java.util.UUID id, java.lang.String name, com.sanha.localyum.restaurant.domain.Category category, com.sanha.localyum.restaurant.domain.Address address, java.lang.String link) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.restaurant.domain.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.restaurant.domain.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    com.sanha.localyum.restaurant.domain.Address p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.restaurant.domain.Category component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sanha.localyum.restaurant.domain.Address component4() {
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
}