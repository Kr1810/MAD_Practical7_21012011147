package com.example.mad_practical7_21012021042

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        val myvideoview = findViewById<VideoView>(R.id.videoview1)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()

        val button = findViewById<FloatingActionButton>(R.id.button)

        button.setOnClickListener {
            Intent(this, MainActivity_Youtube::class.java).apply {
                startActivity(this)
            }

        }
    }
}
