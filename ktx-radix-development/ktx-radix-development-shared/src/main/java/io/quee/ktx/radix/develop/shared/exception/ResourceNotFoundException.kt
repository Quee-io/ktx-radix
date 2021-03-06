package io.quee.ktx.radix.develop.shared.exception

import io.quee.ktx.radix.develop.shared.error.Error

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 29, **Thu Oct, 2020**
 * Project *ktx-radix* [Quee.IO]
 */
class ResourceNotFoundException(error: Error) : BaseException(error)