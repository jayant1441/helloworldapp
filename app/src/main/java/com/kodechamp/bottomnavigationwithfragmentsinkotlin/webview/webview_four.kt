package com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.activity_webview_four.*

class webview_four : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_four)

        class Mywebviewclient4 : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        webview4.webViewClient = Mywebviewclient4()
        webview4.loadUrl("https://helloworldofficial.in/")



    }
}
