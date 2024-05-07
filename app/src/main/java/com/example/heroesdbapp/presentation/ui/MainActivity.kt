package com.example.heroesdbapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesdbapp.R
import com.example.heroesdbapp.domain.models.Hero
import com.example.heroesdbapp.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var heroRecyclerView: RecyclerView
    private var heroes = mutableListOf<Hero>()
    private val mainViewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeState()
        //observeUiEvents()
    }

    private fun observeState(){
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                mainViewModel.state.collect{
                    Log.i("Heroes", it.heroes.toString())
                    heroRecyclerView = findViewById(R.id.heroes_recycleview)
                    //heroRecyclerView.adapter = HeroAdapter(it.shoppingCartProducts)
                    heroRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                }
            }
        }
    }

}