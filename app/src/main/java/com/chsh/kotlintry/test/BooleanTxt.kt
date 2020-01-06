package com.chsh.kotlintry.test

/**
 * Boolean 扩展
 */

sealed class BooleanTxt

object Otherwise:BooleanTxt()
class WithData:BooleanTxt()

inline fun Boolean.yes(block:()->Unit):BooleanTxt =
    when{
        this ->{
            block()
            WithData()
        }
        else ->{
            Otherwise
        }
    }


fun BooleanTxt.otherwise(block: () -> Unit) =
    when(this){
        is Otherwise ->block()
        is WithData -> Unit
    }

