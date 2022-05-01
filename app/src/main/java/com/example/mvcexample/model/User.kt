package com.example.mvcexample.model

import android.text.TextUtils
import android.util.Patterns

class User(
    private val email : String ? ,
    private val password : String ?
) : IUser {

    override fun getEmail(): String? {
        return  email
    }

    override fun getPassword(): String? {
        return password
    }

    override fun isValid(): Int {
        if (TextUtils.isEmpty(getEmail()))
            return 0
        else if (TextUtils.isEmpty(getPassword()))
            return 1
        else if(getPassword()?.length!! <=6)
            return 2
        else return -1
    }
}