package com.sanha.localyum.user.application.service.fixture

import com.navercorp.fixturemonkey.FixtureMonkey
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector
import com.navercorp.fixturemonkey.jakarta.validation.plugin.JakartaValidationPlugin

fun monkey() : FixtureMonkey {
    return FixtureMonkey.builder()
        .plugin(JakartaValidationPlugin())
        .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
        .build()
}
