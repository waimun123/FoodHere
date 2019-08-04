package com.example.foodhere.ui.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.example.foodhere.R
import com.example.foodhere.ui.fragment.LoginFragment

class AuthenticationActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        val fm = supportFragmentManager
        val tx = fm.beginTransaction()
        tx.add(R.id.main_container, LoginFragment())
        tx.commit()
    }

    fun changeFragment(fragment: Fragment) {
        val fm = supportFragmentManager
        val tx = fm.beginTransaction()
        tx.replace(R.id.main_container, fragment)
        tx.addToBackStack(null)
        tx.commit()
    }
}