package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments.CartFragment
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments.HomeFragment
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments.ProfileFragment
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.Fragments.TriviaFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item->
        when(item.itemId){
            R.id.home -> {
                println("home pressed")
                replaceFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.trivia -> {
                println("Trivia pressed")
                replaceFragment(TriviaFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.projects -> {
                println("projects pressed")
                replaceFragment(CartFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.profile -> {
                println("profile pressed")
                replaceFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        
        false

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(HomeFragment())



    }


    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
