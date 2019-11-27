package com.kodechamp.bottomnavigationwithfragmentsinkotlin.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kodechamp.bottomnavigationwithfragmentsinkotlin.R
import kotlinx.android.synthetic.main.activity_webview.*

class webview_one : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)





       class MyWebViewClient : WebViewClient(){

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
       }

        webview.webViewClient = MyWebViewClient()
        webview.loadUrl("https://helloworldofficial.in/upcoming-and-past-events")






    }
}
