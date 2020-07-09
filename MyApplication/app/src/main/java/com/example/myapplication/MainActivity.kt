package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenActivity.setOnClickListener {
            openNewActivity()
        }
    }

    private fun openNewActivity() {
        val activityOptionsCompat =
            ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                binding.btnOpenActivity,
                getString(R.string.button_main)
            )

        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent, activityOptionsCompat.toBundle())
    }
}