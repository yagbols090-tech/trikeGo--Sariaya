package com.trikego.sariaya

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.WHITE)
            setPadding(60, 120, 60, 60)
            gravity = Gravity.CENTER_HORIZONTAL
        }

        val title = TextView(this).apply {
            text = "TrikeGo Sariaya"
            textSize = 32f
            setTextColor(Color.BLACK)
            setPadding(0, 0, 0, 80)
        }
        root.addView(title)

        val btnPassenger = Button(this).apply {
            text = "Passenger Mode"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Passenger Mode coming soon", Toast.LENGTH_SHORT).show()
            }
        }
        root.addView(btnPassenger)

        val btnDriver = Button(this).apply {
            text = "Driver Mode"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Driver Mode coming soon", Toast.LENGTH_SHORT).show()
            }
        }
        root.addView(btnDriver)

        val btnAdmin = Button(this).apply {
            text = "Admin Sign-In"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Admin coming soon", Toast.LENGTH_SHORT).show()
            }
        }
        root.addView(btnAdmin)

        setContentView(root)
    }
}
