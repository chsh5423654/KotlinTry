package com.chsh.kotlintry

import com.chsh.kotlintry.test.Preference

object Settings {
    var email: String by Preference(AppContext, "email", "")
    var password: String by Preference(AppContext, "password", "")
}