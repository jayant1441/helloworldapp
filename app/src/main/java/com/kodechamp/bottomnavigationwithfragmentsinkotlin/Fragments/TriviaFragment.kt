package com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.fragment_trivia.*
import kotlinx.android.synthetic.main.fragment_trivia.view.*


class TriviaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view2 = inflater.inflate(R.layout.fragment_trivia, container, false)
        var button  = view2.button as Button
        var imageView4 = view2.imageView4 as ImageView
        button.setOnClickListener {
           Toast.makeText(context,"Trivia is never held",Toast.LENGTH_SHORT).show()
        }
        imageView4.setOnClickListener {
            Toast.makeText(context,"No past Winners",Toast.LENGTH_SHORT).show()
        }

        return view2




    }


}
