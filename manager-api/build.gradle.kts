//plugins {
//    id("com.ewerk.gradle.plugins.querydsl") version "1.0.10"
//}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.cloud:spring-cloud-starter-config")
    implementation ("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.6.2")
    runtimeOnly ("mysql:mysql-connector-java")
    testRuntimeOnly ("com.h2database:h2")
}