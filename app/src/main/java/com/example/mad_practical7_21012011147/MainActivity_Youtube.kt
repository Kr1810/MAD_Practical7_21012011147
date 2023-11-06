package com.example.mad_practical7_21012021042

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity_Youtube : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_youtube)

        val youtubeid="fJn9B64Znrk"
        val mywebview=findViewById<WebView>(R.id.webview1)
        val webSettings=mywebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        mywebview.loadUrl("https//:www.youtube.com/embed/$youtubeid")

    }
}
