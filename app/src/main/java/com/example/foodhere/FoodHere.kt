package com.example.foodhere

import android.app.Application

class FoodHere:Application(){

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: FoodHere? = null
    }
}