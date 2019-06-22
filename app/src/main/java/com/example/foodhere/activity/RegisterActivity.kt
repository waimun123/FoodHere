package com.example.foodhere.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.foodhere.R
import com.example.foodhere.utils.ValidationUtils
import kotlinx.android.synthetic.main.activity_registration.*

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v){
            btn_register -> {
                if (!ValidationUtils.isValidEmail(et_usernameRegister.text.toString())) {
                    et_usernameRegister.error = "Please enter a valid email address"
                    requestFocus(et_usernameRegister)
                    return
                } else if (!ValidationUtils.validatePassword(et_passwordRegister.text.toString())) {
                    et_passwordRegister.error = "Invalid Password (Min 8 Alphanumeric)"
                    requestFocusNoKeyBoard(et_passwordRegister)
                    return
                } else if (!ValidationUtils.comparePasswords(et_passwordRegister.text.toString(), et_confirmRegister.text.toString())) {
                    requestFocusNoKeyBoard(et_confirmRegister)
                    et_confirmRegister.error = "Passwords do not match"
                    return
                } else {
                    Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show()
                    startActivity(Intent(this, LoginActivity::class.java))
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btn_register.setOnClickListener(this)
    }

    private fun requestFocus(view: View) {
        val imgr = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imgr.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, InputMethodManager.HIDE_IMPLICIT_ONLY)
        view.requestFocus()
    }

    private fun requestFocusNoKeyBoard(view: View) {
        if (view.requestFocus()) {
            this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
        }
    }
}
