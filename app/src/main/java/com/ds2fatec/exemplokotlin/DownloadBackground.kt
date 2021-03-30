package com.ds2fatec.exemplokotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.net.URL

class DownloadBackground(var iv: ImageView) : AsyncTask<String, Void, Bitmap>(){

    override fun doInBackground(vararg link: String): Bitmap {
        val link = URL(link[0]).openStream()
        return BitmapFactory.decodeStream(link)

    }

    override fun onPostExecute(imagem: Bitmap?) {
        iv.setImageBitmap(imagem)
    }

}