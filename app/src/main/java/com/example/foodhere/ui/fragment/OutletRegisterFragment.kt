package com.example.foodhere.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.foodhere.R
import com.example.foodhere.ui.activity.AuthenticationActivity

class OutletRegisterFragment : Fragment(){

    private lateinit var mainActivity: AuthenticationActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_outlet_register, container, false)

        mainActivity = activity as AuthenticationActivity

        val register = view.findViewById<TextView>(R.id.tv_register_next)
        register.setOnClickListener {
            mainActivity.changeFragment(LoginFragment())
        }

        return view
    }
}