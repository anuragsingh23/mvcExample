package com.example.mvcexample.view

interface ILoginView {

    fun OnLoginSuccess(message: String?)
    fun OnLoginError(message: String?)
}