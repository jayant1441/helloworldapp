package com.kodechamp.bottomnavigationwithfragmentsinkotlin.LoginActivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var context = this
        var db = loginSQL(context)

        btn_login.setOnClickListener {
            if (et_signupemail.text.length > 0 && et_signuppasword.text.length > 0) {
                var user = LoginDataClass(et_signupemail.text.toString(), et_signuppasword.text.toString())
                db.add(user)
                finish()
                Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()


                /**
                if (tv_login != null){
                tv_login.text =  et_loginemail.text.toString()
                tv_login.isEnabled = false
                }
                else{
                Toast.makeText(context,"null",Toast.LENGTH_SHORT).show()
                }

                 **/


            } else {
                Toast.makeText(context, "Please enter Valid Email or Password", Toast.LENGTH_SHORT).show()
            }
        }

        btn_signup.setOnClickListener {
            val intent_to_signUp = Intent(this, SignUp::class.java)
            startActivity(intent_to_signUp)
            this.finish()


        }

    }
}

















