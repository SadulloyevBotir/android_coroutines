package com.example.android_coroutines.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android_coroutines.databinding.ActivityMainBinding
import com.example.android_coroutines.utils.Status
import com.example.android_coroutines.viewmodels.UserViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        userViewModel.getUsers().observe(this, Observer {
            when (it.status) {
                Status.LOADING -> {

                }
                Status.SUCCESS -> {
                    binding.tv.text = it.data
                }
                Status.ERROR -> {

                }
            }
        })
    }
}