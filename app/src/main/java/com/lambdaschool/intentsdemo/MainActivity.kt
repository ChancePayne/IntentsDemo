package com.lambdaschool.intentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        public val STRING_DATA_KEY = "PASSED_DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simple_intent_button.setOnClickListener {
            val intent = Intent(this, FullscreenActivity::class.java)
            startActivity(intent)
        }

        data_intent_button.setOnClickListener {
            val intent = Intent(this, FullscreenActivity::class.java)
            intent.putExtra(STRING_DATA_KEY, "Hello Intents!")
            startActivity(intent)
        }
    }
}
