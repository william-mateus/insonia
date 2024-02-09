package com.example.insonia

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.lifecycle.ViewModelProvider
import com.example.insonia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var num =0;
        //musica
        val musica = MediaPlayer.create(this,R.raw.musica_theme)
        binding.count.setOnClickListener {
            num +=1;
            binding.textView.text = (num.toString())
        }

        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->

            if (buttonView.isChecked){
                musica.seekTo(0)
                musica.start()
            } else{
                musica.pause()
            }
        }
    }
}