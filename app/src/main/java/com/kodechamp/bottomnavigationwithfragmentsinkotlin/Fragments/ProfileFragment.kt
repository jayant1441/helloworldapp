package com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.activity_webview.*
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        fun intentactivity2(webview_name:WebView){
            var intent = Intent(context, webview_name::class.java)
            startActivity(intent)
        }

        var myview =  inflater.inflate(R.layout.fragment_profile, container, false)
        var tv_aboutus = myview.tv_aboutus as TextView













        tv_aboutus.setOnClickListener {
            intentactivity2(webview)
        }

        return myview
    }


}
