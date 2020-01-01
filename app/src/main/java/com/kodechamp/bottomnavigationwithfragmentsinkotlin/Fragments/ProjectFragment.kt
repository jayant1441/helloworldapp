package com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.MainActivity
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.ProjectDescription
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.Projects
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.fragment_project.view.*
import kotlinx.android.synthetic.main.grid_view_ticket.view.*


class ProjectFragment : Fragment() {

    var adapter :ProjectAdapter?  = null
    var ListOfProjects = ArrayList<Projects>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        ListOfProjects.add(Projects("C/C++ \n" ,R.drawable.graphic_c))
        ListOfProjects.add(Projects("Graphics\n",R.drawable.graphic_design))
        ListOfProjects.add(Projects("Ethical \nHacking",R.drawable.hacking_graphics))
        ListOfProjects.add(Projects("Python\n",R.drawable.pythongraphic))
        ListOfProjects.add(Projects("ML\n",R.drawable.brain_graphics))
        ListOfProjects.add(Projects("Data Science\n",R.drawable.datascience))
        ListOfProjects.add(Projects("Android \n(Java)",R.drawable.graphics_android))
        ListOfProjects.add(Projects("Android\n(Flutter)",R.drawable.flutter_graphihcs))
        ListOfProjects.add(Projects("WebD\n",R.drawable.website_graphics))
        adapter = ProjectAdapter(context!!,ListOfProjects)



        var myview3 =  inflater.inflate(R.layout.fragment_project, container, false)
        var gv_project = myview3.gv_project as GridView
        gv_project.adapter = adapter
        return myview3
    }



    class ProjectAdapter:BaseAdapter{
         var ListOfProjects  = ArrayList<Projects>()
         var context:Context? = null
        constructor(context:Context,ListOfProjects:ArrayList<Projects>){
            this.context = context
            this.ListOfProjects = ListOfProjects
        }

        fun intent_to_project_description(){
            var intent = Intent(context,ProjectDescription::class.java)
            context!!.startActivity(intent)
        }


        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val project = this.ListOfProjects[p0]
            val inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val MyProjectView = inflater.inflate(R.layout.grid_view_ticket,null)
            MyProjectView.iv_ProjectIcon.setImageResource(project.ProjectIcon!!)


            MyProjectView.iv_ProjectIcon.setOnClickListener {
               if(p0>=0&&p0<9) {
                   intent_to_project_description()
               }
            }

            MyProjectView.tv_ProjectName.text  = project.ProjectName!!
            return MyProjectView
        }

        override fun getItem(p0: Int): Any {
            return ListOfProjects[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return ListOfProjects.size
        }

    }


}
