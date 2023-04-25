package io.spherelabs.buildableprocessors

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec

interface Generator {
    operator fun invoke(key: ClassName, list: List<ClassName>): FileSpec
}