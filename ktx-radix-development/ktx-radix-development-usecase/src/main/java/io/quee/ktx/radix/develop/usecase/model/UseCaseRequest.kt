package io.quee.ktx.radix.develop.usecase.model

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 29, **Thu Oct, 2020**
 * Project *ktx-radix* [Quee.IO]
 */
interface UseCaseRequest {
    companion object {
        val NOP: UseCaseRequest = object : UseCaseRequest {}
    }
}