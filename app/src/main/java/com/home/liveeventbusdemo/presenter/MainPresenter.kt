package com.home.liveeventbusdemo.presenter

import com.home.liveeventbusdemo.model.MainBean
import com.home.liveeventbusdemo.model.MainModel
import com.home.liveeventbusdemo.view.adapter.MainAdapter

class MainPresenter(private val onMainViewListener: OnMainViewListener) {

    interface OnMainViewListener {
        fun onItemClick(result: MainBean.Result)
    }

    private val mainModel: MainModel = MainModel()
    private lateinit var mainBean: MainBean

    fun getMainAdapter(): MainAdapter {
        val adapter = MainAdapter()
        mainModel.getMainData(object : MainModel.OnGetMainDataListener {
            override fun onSuccess(mainData: MainBean) {
                this@MainPresenter.mainBean = mainData
                adapter.setPostList(mainData.results)
                adapter.setOnMainAdapterListener(object : MainAdapter.OnMainAdapterListener {
                    override fun onItemClick(position: Int) {
                        onMainViewListener.onItemClick(mainBean.results[position])
                    }
                })
            }
        })
        return adapter
    }
}