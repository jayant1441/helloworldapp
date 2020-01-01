package com.kodechamp.bottomnavigationwithfragmentsinkotlin.LoginActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.activity_login.et_signupemail
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_signup2.setOnClickListener{
            if(et_signupemail.text.length > 0 && et_signuppasword.text.length > 0 && et_SignupName.text.length>0) {


                finish()
                Toast.makeText(this, "Signup Successfully", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Please enter valid entities ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
