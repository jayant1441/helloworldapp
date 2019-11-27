package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val dbname = "helloworld_database"
val tablename = "login_table"
val ColId = "Id"
val ColName = "Name"
val ColEmail = "Email"
val ColPassword = "Password"
val dbversion = 1


class loginSQL(var context: Context):SQLiteOpenHelper(context, dbname,null, dbversion ){

    override fun onCreate(p0: SQLiteDatabase?) {
        var create_table = "CREATE TABLE IF NOT EXISTS " +tablename+ "(" + ColEmail + " VARCHAER(256), " + ColPassword + " VARCHAR(256))"
        p0!!.execSQL(create_table)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun add(user:LoginDataClass){
        var db = this.writableDatabase
        var cv = ContentValues()
        cv.put(ColEmail,user.Email)
        cv.put(ColPassword,user.Password)
        db.insert(tablename,null,cv)


    }
}

