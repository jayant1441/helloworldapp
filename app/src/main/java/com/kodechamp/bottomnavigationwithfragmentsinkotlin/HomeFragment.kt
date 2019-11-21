package com.kodechamp.bottomnavigationwithfragmentsinkotlin


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_webview.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
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
            startActivity(Intent.createChooser(intent , "Share to"))
        }



        return myView
    }


}

