package com.example.mvcexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvcexample.R
import com.example.mvcexample.controller.ILoginController
import com.example.mvcexample.controller.LoginController
import com.example.mvcexample.databinding.ActivityMainBinding
import com.example.mvcexample.view.ILoginView

class MainActivity : AppCompatActivity() , ILoginView {

    private lateinit var mBinding : ActivityMainBinding
    var loginPresenter: ILoginController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

         loginPresenter = LoginController(this)

        mBinding.mButtonLogin.setOnClickListener {
            (loginPresenter as LoginController).OnLogin(mBinding.edtUserName.text.toString(),
            mBinding.edtPassword.text.toString().trim())
        }
    }



    override fun OnLoginSuccess(message: String?) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }

    override fun OnLoginError(message: String?) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()

    }
}