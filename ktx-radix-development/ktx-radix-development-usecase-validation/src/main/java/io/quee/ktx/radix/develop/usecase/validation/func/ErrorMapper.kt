package io.quee.ktx.radix.develop.usecase.validation.func

import io.quee.ktx.radix.develop.shared.error.Error
import io.quee.ktx.radix.develop.usecase.model.UseCaseRequest
import javax.validation.ConstraintViolation

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 29, **Thu Oct, 2020**
 * Project *ktx-radix* [Quee.IO]
 */
interface ErrorMapper {
    fun <RQ : UseCaseRequest> ConstraintViolation<RQ>.mapToError(): Error
}