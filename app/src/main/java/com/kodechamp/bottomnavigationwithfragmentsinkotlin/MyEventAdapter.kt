package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.app.FragmentTransaction
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_four
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_one
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_three
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview.webview_two
import kotlinx.android.synthetic.main.grid_view_ticket.view.*

class MyEventAdapter : BaseAdapter {


    var context: Context? = null
    var ListOfEvents = ArrayList<HomeEvents>()

    constructor(context: Context, ListOfEvents: ArrayList<HomeEvents>) {
        this.context = context
        this.ListOfEvents = ListOfEvents
    }


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        fun intentactivity(webviewname: Any) {
            var intent = Intent(context, webviewname::class.java)
            context!!.startActivity(intent)
        }

        var event = this.ListOfEvents[p0]
        var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var MyEventView = inflater.inflate(R.layout.grid_view_ticket, null)
        MyEventView.tv_ProjectName.text = event.EventName!!
        MyEventView.iv_ProjectIcon.setImageResource(event.EventIcon!!)



        MyEventView.iv_ProjectIcon.setOnClickListener {
            when (p0) {
                0 -> {
                    intentactivity(webview_one())
                    Toast.makeText(context, "Opening Events", Toast.LENGTH_SHORT).show()
                }
                1 -> {
                    intentactivity(webview_two())
                    Toast.makeText(context, "Opening About us", Toast.LENGTH_SHORT).show()
                }
                2 -> {
                    intentactivity(webview_three())
                    Toast.makeText(context, "Opening contact", Toast.LENGTH_SHORT).show()
                }
                3 -> {
                    intentactivity(webview_four())
                    Toast.makeText(context, "Opening Website", Toast.LENGTH_SHORT).show()
                }
                4 -> {
                    var intent3 = Intent()
                    intent3.action = Intent.ACTION_SEND
                    intent3.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.team.helloworld")
                    intent3.type = "text/plain"
                    context!!.startActivity(Intent.createChooser(intent3, "Share to"))
                }
                5 -> {
                    val intent = Intent(Intent.ACTION_SENDTO)
                    // below line tell that data is handled by only mailing apps
                    intent.data = Uri.parse("mailto:")
                    intent.putExtra(Intent.EXTRA_EMAIL, "jayantdhingra1441@gmail.com")
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback")
                    context!!.startActivity(intent)
                }

                else -> {
                    Toast.makeText(context, "There is some error", Toast.LENGTH_SHORT).show()
                }

            }
        }

        return MyEventView
    }

    override fun getItem(p0: Int): Any {
        return ListOfEvents[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return ListOfEvents.size
    }


}