package com.example.foodhere.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.foodhere.R
import com.example.foodhere.ui.activity.AuthenticationActivity

class LoginFragment: Fragment() {

    private lateinit var mainActivity: AuthenticationActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        mainActivity = activity as AuthenticationActivity

        val volRegister = view.findViewById<TextView>(R.id.tv_volunteer_register)
        volRegister.setOnClickListener {
            mainActivity.changeFragment(VolunteerRegisterFragment())
        }

        val foRegister = view.findViewById<TextView>(R.id.tv_outlet_register)
        foRegister.setOnClickListener {
            mainActivity.changeFragment(OutletRegisterFragment())
        }

        return view
    }
}