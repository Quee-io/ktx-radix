package io.quee.ktx.radix.tool.tracker.model

import org.springframework.http.HttpMethod

/**
 * Created By [*Ibrahim AlTamimi *](https://www.linkedin.com/in/iloom/)
 * Created At 30, **Fri Oct, 2020**
 * Project *ktx-radix* [Quee.IO]
 */
interface TrackedPath {
    val path: String
    val methods: Set<HttpMethod>
}