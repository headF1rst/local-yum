package com.sanha.localyum.restaurant.domain

@JvmInline
value class Url(
    private val link: String
) {
    init {
        require(link.isNotEmpty()) { "URL은 비어 있을 수 없습니다." }
        require(link.length <= 2048) { "URL의 길이는 2048자를 초과할 수 없습니다." }
        require(link.startsWith("https://")) { "URL은 https://로 시작해야 합니다." }
    }
}
