package com.vitorota.fishingsimulator

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

/**
 *
 * @author Vitor Ota
 * @since 14/05/2019
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_main)
        val textView = findViewById<TextView>(R.id.textView)
        findViewById<ImageView>(R.id.imageView).setOnClickListener {
            textView.isVisible = !textView.isVisible
        }
    }
}