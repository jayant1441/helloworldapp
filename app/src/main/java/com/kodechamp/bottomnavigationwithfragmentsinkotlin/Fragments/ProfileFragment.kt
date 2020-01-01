package com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.LoginActivity.login
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.developer
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        fun intentactivity2(website_name:String){
             var intent = Intent(Intent.ACTION_VIEW, Uri.parse(website_name))
            startActivity(intent)
        }

        var myview =  inflater.inflate(R.layout.fragment_profile, container, false)
        var tv_login = myview.tv_login as TextView
        var tv_aboutus = myview.tv_aboutus as TextView
        var tv_contactus = myview.tv_contactus as TextView
        var tv_privacypolicy = myview.tv_privacypolicy as TextView
        var tv_feedback = myview.tv_feedback as TextView
        var tv_shareapp = myview.tv_shareapp as TextView
        var tv_developer = myview.tv_developer as TextView


        tv_login.setOnClickListener {
            tv_login.isEnabled = false
            var intentlogin = Intent(context, login::class.java)
            startActivity(intentlogin)



        }

        tv_aboutus.setOnClickListener {
            intentactivity2("https://helloworldofficial.in/about")
            Toast.makeText(context,"Opening About Us",Toast.LENGTH_LONG).show()
        }
        tv_contactus.setOnClickListener {
            intentactivity2("https://helloworldofficial.in/contact")
            Toast.makeText(context,"Opening Contact Us",Toast.LENGTH_LONG).show()
        }
        tv_privacypolicy.setOnClickListener {
            intentactivity2("https://helloworldofficial.in/privacy-policy")
            Toast.makeText(context,"Opening Privacy policy",Toast.LENGTH_LONG).show()
        }
        tv_feedback.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            // below line tell that data is handled by only mailing apps
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_EMAIL, "jayantdhingra1441@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback")
            startActivity(intent)
        }
        tv_shareapp.setOnClickListener {
            var intent2 = Intent()
            intent2.action = Intent.ACTION_SEND
            intent2.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.team.helloworld")
            intent2.type = "text/plain"
            startActivity(Intent.createChooser(intent2 , "Share to"))

        }
        tv_developer.setOnClickListener {
            var itent = Intent(context,developer::class.java)
            startActivity(itent)
        }



        return myview
    }


}
