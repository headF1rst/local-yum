package com.sanha.localyum.user.application.service.fixture

import com.navercorp.fixturemonkey.ArbitraryBuilder

fun <T> defaultFixtureBuilder(clazz: Class<T>): ArbitraryBuilder<T> {
    return monkey().giveMeBuilder(clazz)
}
