package io.behzod.buildable

import io.behzod.mapper.BuildableMapper

@BuildableMapper(
    [CouponApproveDomain::class]
)
data class CouponApproveDto(
    val tid: String
)

@BuildableMapper(
    [CouponApproveDto::class]
)
data class CouponApproveDomain(
    val tid: String
)

@BuildableMapper(
    [ExchangeDomain::class]
)
data class ExchangeString(
    val name: String
)

data class ExchangeDomain(
    val name: String
)

fun main() {

}