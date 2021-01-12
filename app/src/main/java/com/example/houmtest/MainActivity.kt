package com.example.houmtest

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.CAMERA,
                        Manifest.permission.CAPTURE_AUDIO_OUTPUT,
                        Manifest.permission.USE_SIP,
                        Manifest.permission.RECORD_AUDIO,
                        Manifest.permission.RECORD_AUDIO,
                        Manifest.permission.READ_EXTERNAL_STORAGE),
                200);
    }

    fun openUrl(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, WebViewActivity::class.java).apply {
            putExtra(WEB_URL, message)
        }
        startActivity(intent)
    }
}

var WEB_URL = "WEB_URL"