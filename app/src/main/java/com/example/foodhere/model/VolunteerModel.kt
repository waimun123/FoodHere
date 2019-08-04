package com.example.foodhere.model

class VolunteerModel {

    var email: String = ""
    var password: String = ""
    var fullName: String = ""
    var mobileNo: Int = 0
    var carBrand: String = ""
    var carModel: String = ""
    var carPlate: String = ""

    constructor(email: String, pass: String, name: String, mobile: Int, brand: String, model: String, plate: String){
        this.email = email
        password = pass
        fullName = name
        mobileNo = mobile
        carBrand = brand
        carModel = model
        carPlate = plate
    }
}