package com.sanha.localyum

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan

@SpringBootApplication
@ConfigurationPropertiesScan
class LocalYumApplication

fun main(args: Array<String>) {
    runApplication<LocalYumApplication>(*args)
}
