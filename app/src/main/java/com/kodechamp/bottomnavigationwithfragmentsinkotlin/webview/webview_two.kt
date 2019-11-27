package com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.activity_webview_two.*

class webview_two : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_two)



        class MyWebViewClient2 : WebViewClient(){

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        webview2.webViewClient = MyWebViewClient2()
        webview2.loadUrl("https://helloworldofficial.in/about")

    }
}



