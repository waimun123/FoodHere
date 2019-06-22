package com.example.foodhere.utils

import android.text.TextUtils

class ValidationUtils {

    companion object{

        fun isValidEmail(email: String): Boolean {

            return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }

        fun validatePassword(password: String): Boolean {
            if (password.isEmpty() || password.length<8) {
                return false
            } else {
            }

            return true
        }


        fun comparePasswords(password: String, confirm_password: String): Boolean {
            if (password != confirm_password) {
                return false
            } else {
            }

            return true
        }
    }
}