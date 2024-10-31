package com.example.kotlin_pr

import android.app.Activity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.kotlin_pr.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var button1 : Button = binding.button1
        var button2 : Button = binding.button2
        var FrameLayout = binding.fragmentContainerView
        val fragment1  = Fragment1()
        val fragment2  = Fragment2()
        val fragment3  = Fragment3()


        button1.setOnClickListener{
            trans(fragment1)

        }
        button2.setOnClickListener{
            trans(fragment2)

        }


    }

    fun trans(frag : Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, frag)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}