allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.MappedSuperclass")
    annotation("jakarta.persistence.Embeddable")
}

dependencies {
    compileOnly(project(":domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") // api -> implementation
    runtimeOnly("org.postgresql:postgresql")
    runtimeOnly("com.h2database:h2")
}
