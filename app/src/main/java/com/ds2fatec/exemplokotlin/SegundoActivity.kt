package com.ds2fatec.exemplokotlin

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.net.URL

class SegundoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)

        val link = "https://developer.android.com/topic/performance/images/moarparrots.png"
        val imageView = findViewById<ImageView>(R.id.imageView)

        val downloader = DownloadBackground(imageView)
        downloader.execute(link)

    }
}