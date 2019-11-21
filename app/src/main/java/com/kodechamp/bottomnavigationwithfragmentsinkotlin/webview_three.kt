package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_webview.*
import kotlinx.android.synthetic.main.activity_webview_three.*

class webview_three : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_three)


        class MywebViewClient3 : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        webview3.webViewClient = MywebViewClient3()
        webview3.loadUrl("https://helloworldofficial.in/gallery")
    }
}
