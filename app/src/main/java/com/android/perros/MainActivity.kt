package com.android.perros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.perros.adapter.ItemSelectedListener
import com.android.perros.adapter.PerrosAdapter
import com.android.perros.adapter.PosicionSelectedListener
import com.android.perros.beans.Perro
import com.android.perros.databinding.ActivityMainBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    private var perrosAdapter: PerrosAdapter? = null
    private lateinit var perrosRecyclerView: RecyclerView
    val json = "[{\"idSplaft\":2,\"codeTI\":2,\"description\":\"Chihuahua\",\"state\":1},{\"idSplaft\":3,\"codeTI\":3,\"description\":\"Bulldog\",\"state\":1},{\"idSplaft\":5,\"codeTI\":5,\"description\":\"Caniche\",\"state\":1},{\"idSplaft\":6,\"codeTI\":6,\"description\":\"Yorkshire\",\"state\":1},{\"idSplaft\":7,\"codeTI\":7,\"description\":\"Labrador\",\"state\":1},{\"idSplaft\":8,\"codeTI\":8,\"description\":\"Boxer\",\"state\":1},{\"idSplaft\":9,\"codeTI\":9,\"description\":\"Husky\",\"state\":1},{\"idSplaft\":11,\"codeTI\":11,\"description\":\"Pitbull\",\"state\":1},{\"idSplaft\":13,\"codeTI\":13,\"description\":\"San Bernardo\",\"state\":1},{\"idSplaft\":14,\"codeTI\":14,\"description\":\"Otros\",\"state\":1}]"
    val gson = Gson()
    val itemType = object : TypeToken<List<Perro>>() {}.type
    val itemList = gson.fromJson<List<Perro>>(json, itemType)
    //private val mainActivityViewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        perrosRecyclerView = binding.perrosRecyclerView
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        perrosAdapter = PerrosAdapter(
            ItemSelectedListener{perro ->

            }, PosicionSelectedListener{posicion, perro ->
                Log.i("click", "click")
                viewModel.detalleTrue()
            },
            viewModel
        )
        perrosRecyclerView?.adapter = perrosAdapter
        perrosRecyclerView.layoutManager = LinearLayoutManager(this)
        perrosAdapter?.submitList(itemList)


    }
}