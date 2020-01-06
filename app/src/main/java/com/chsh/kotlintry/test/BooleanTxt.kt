package com.chsh.kotlintry.test

/**
 * Boolean 扩展
 */

sealed class BooleanTxt<out T>

object Otherwise : BooleanTxt<Nothing>()
class WithData<T>(val data: T) : BooleanTxt<T>()

inline fun <T> Boolean.yes(block: () -> T) =
    when {
        this -> {
            WithData(block())
        }
        else -> {
            Otherwise
        }
    }

fun <T> Boolean.no(block: () -> T) = when {
    this -> Otherwise
    else -> {
        WithData(block())
    }
}


inline fun <T> BooleanTxt<T>.otherwise(block: () -> T): T =
    when (this) {
        is Otherwise -> block()
        is WithData -> this.data
    }

