package com.home.liveeventbusdemo.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.home.liveeventbusdemo.model.MainBean
import com.home.liveeventbusdemo.presenter.MainPresenter
import com.home.liveeventbusdemo.view.adapter.MainAdapter
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.OnMainViewListener {

    companion object {
        const val KEY_RESULT = "key_result"
    }

    private val mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.home.liveeventbusdemo.R.layout.activity_main)
        initializeRecyclerView(mainPresenter.getMainAdapter())
    }

    private fun initializeRecyclerView(adapter: MainAdapter) {
        recycler_view.adapter = adapter
        val cacheSize = -1
        recycler_view.setItemViewCacheSize(cacheSize) // 解決複用錯亂的問題
    }

    override fun onItemClick(result: MainBean.Result) {
        LiveEventBus.get(KEY_RESULT).post(result)
        startActivity(Intent(this, DetailActivity::class.java))
    }
}
