package com.example.desafiostefanini.ui.activity

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiostefanini.R
import com.example.desafiostefanini.ui.adapter.MainAdapter
import com.example.desafiostefanini.model.Data
import com.example.desafiostefanini.provider.providerMainViewModel
import com.example.desafiostefanini.ui.viewmodel.state.MainState

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        providerMainViewModel(this)
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var progressBar: ProgressBar

    private val adapter by lazy {
        MainAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.let {
            it.hide()
        }

        bindViews()

        createObserver()
        setupRecyclerView()
    }

    private fun bindViews() {
        recyclerView = findViewById(R.id.rv_images)
        progressBar = findViewById(R.id.progressBar)
    }

    private fun createObserver() {
        viewModel.viewState.observe(this, Observer { viewState ->
            viewState?.let {
                when (it) {
                    is MainState.GetImages -> showImages(it.response.data)
                    is MainState.IsError -> showError(it.error)
                    is MainState.ShowLoading -> showLoading()
                    is MainState.HideLoading -> hideLoading()
                }
            }
        })

        viewModel.getImages()
    }

    private fun showImages(data: List<Data>?) {
        data?.let {
            adapter.updateAdapter(it)
        }
    }

    private fun setupRecyclerView() {
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 3)
    }

    private fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    private fun showLoading() {
        progressBar.visibility = VISIBLE
    }

    private fun hideLoading() {
        progressBar.visibility = GONE
    }
}