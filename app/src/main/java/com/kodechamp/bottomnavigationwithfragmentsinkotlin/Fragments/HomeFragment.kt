package com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SnapHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    var ListOfEvents = ArrayList<HomeEvents>()
    var ListOfRecyclerVIew = ArrayList<RecyclerViewDataClass>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        ListOfEvents.add(HomeEvents("Events", R.drawable.event_graphic))
        ListOfEvents.add(HomeEvents("About us", R.drawable.about_graphic))
        ListOfEvents.add(HomeEvents("Contact us", R.drawable.contact_graphic))
        ListOfEvents.add(HomeEvents("Visit Website", R.drawable.website_graphic))
        ListOfEvents.add(HomeEvents("Share app", R.drawable.share_graphic))
        ListOfEvents.add(HomeEvents("Feedback", R.drawable.feedback_graphic))
        var adapter = MyEventAdapter(context!!, ListOfEvents)

        ListOfRecyclerVIew.add(RecyclerViewDataClass(R.drawable.pngtree3,"Build Project with \nOther Student \nMentors"))
        ListOfRecyclerVIew.add(RecyclerViewDataClass(R.drawable.pngtree2,"Get Invitation to \n various Tech \nEvents"))
        ListOfRecyclerVIew.add(RecyclerViewDataClass(R.drawable.pngtree3,"Get in touch\n With HelloWorld mentors\n to Solve problem"))
        ListOfRecyclerVIew.add(RecyclerViewDataClass(R.drawable.pngtree5,"Be a Part of\n Non-Profit\n Technical Club"))



        // Inflate the layout for this fragment
        var myView = inflater.inflate(R.layout.fragment_home, container, false)
        var facebook_contact = myView.facebook_contact as ImageView
        var instagram_contact = myView.instagram_contact as ImageView
        var whatsapp_contact = myView.whatsapp_contact as ImageView
        var linkedin_contct = myView.linkedin_contact as ImageView
        var gmail_contact = myView.gmail_contact as ImageView
        var website_contact = myView.website_contact as ImageView


        var gv_HomeEvent = myView.gv_HomeEvent as GridView
        gv_HomeEvent.adapter = adapter



        facebook_contact.setOnClickListener {
            intent_to_website("https://www.facebook.com/helloworldteam/")
            Toast.makeText(context,"Opening Facebook",Toast.LENGTH_SHORT).show()
        }
        instagram_contact.setOnClickListener {
            intent_to_website("https://www.instagram.com/official_hello_world/")
            Toast.makeText(context,"Opening Instagram",Toast.LENGTH_SHORT).show()
        }
        whatsapp_contact.setOnClickListener {
            intent_to_website("https://chat.whatsapp.com/BmAolfGm1Y55NoDfxPN2YY")
            Toast.makeText(context,"Opening Whatsapp",Toast.LENGTH_SHORT).show()
        }
        linkedin_contct.setOnClickListener {
            intent_to_website("https://www.linkedin.com/company/helloworldofficial")
            Toast.makeText(context,"Opening Contact Us",Toast.LENGTH_SHORT).show()
        }
        gmail_contact.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_EMAIL, "contact@helloworldofficial.in")
            intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback")
            startActivity(intent)
            Toast.makeText(context,"Opening Gmail",Toast.LENGTH_SHORT).show()
        }
        website_contact.setOnClickListener {
            intent_to_website("https://helloworldofficial.in/")
            Toast.makeText(context,"Opening Website",Toast.LENGTH_SHORT).show()
        }


        var rv = myView.recycler_view as RecyclerView
        rv.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rv.adapter = MyRecyclerViewAdapter(context!!,ListOfRecyclerVIew)

        var snapHelper:SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv)



        return myView
    }





    fun intent_to_website(website_name:String){
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse(website_name))
        startActivity(intent)
    }
}



