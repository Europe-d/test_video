package com.example.test_video

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView : VideoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val onlineUri : Uri = Uri.parse("")
        val offlineUri : Uri = Uri.parse("android.resource://$packageName/${R.raw.tiktokvideos1}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()
    }
}