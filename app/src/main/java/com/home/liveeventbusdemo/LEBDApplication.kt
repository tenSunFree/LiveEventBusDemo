package com.home.liveeventbusdemo

import android.app.Application

import com.jeremyliao.liveeventbus.LiveEventBus

class LEBDApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeLiveEventBus()
    }

    private fun initializeLiveEventBus() {
        LiveEventBus.config()
            .supportBroadcast(this)
            .lifecycleObserverAlwaysActive(true)
    }
}
