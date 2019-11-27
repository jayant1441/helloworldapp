package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.content.ContentValues
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var context = this
        var db = loginSQL(context)

        btn_login.setOnClickListener{
            if(et_loginemail.text.length > 0 && et_loginpasword.text.length > 0 ){
            var user = LoginDataClass(et_loginemail.text.toString(),et_loginpasword.text.toString())
            db.add(user)
            }
            else{
                Toast.makeText(context,"Please enter Valid Email or Password",Toast.LENGTH_SHORT).show()
            }
        }
    }




}












