package com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.*
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_four
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_one
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_three
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_two

import kotlinx.android.synthetic.main.fragment_home.view.*




class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        fun intentactivity(webview_name:Any){
            val intent = Intent(context,webview_name::class.java)
            startActivity(intent)
        }





        var myView = inflater.inflate(R.layout.fragment_home, container, false)
        var iv_events = myView.iv_events as ImageView
        val iv_aboutus = myView.iv_aboutus as ImageView
        val iv_gallery = myView.iv_gallery as ImageView
        val iv_website = myView.iv_website as ImageView
        val iv_share = myView.iv_share as ImageView


        iv_events.setOnClickListener {
           intentactivity(webview_one())
        }
        iv_aboutus.setOnClickListener {
            intentactivity(webview_two())
        }
        iv_gallery.setOnClickListener {
            intentactivity(webview_three())
        }
        iv_website.setOnClickListener {
            intentactivity(webview_four())
        }
        iv_share.setOnClickListener {
            var intent  = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT , "https://play.google.com/store/apps/details?id=com.team.helloworld")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent , "Share to"))
        }



        return myView
    }


}

