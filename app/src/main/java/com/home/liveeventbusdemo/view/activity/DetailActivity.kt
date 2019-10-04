package com.home.liveeventbusdemo.view.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.home.liveeventbusdemo.R
import com.home.liveeventbusdemo.model.MainBean
import com.jeremyliao.liveeventbus.LiveEventBus
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        LiveEventBus
            .get(MainActivity.KEY_RESULT, MainBean.Result::class.java)
            .observeSticky(this,
                Observer<MainBean.Result> { result -> initializeView(result) })
    }

    @SuppressLint("SetTextI18n")
    private fun initializeView(result: MainBean.Result) {
        val name: String = result.name
        val startIndex = 0
        val endIndex = name.lastIndexOf(".")
        name_text_view.text = name.substring(startIndex, endIndex)
        Glide.with(this@DetailActivity).load(result.avatarImageUrl)
            .into(avatar_image_view)
        area_text_view.text = getString(R.string.activity_detail_area) + result.area
        appointment_count_text_view.text =
            getString(R.string.activity_detail_appointment_count) + result.appointmentCount
        content_text_view.text = result.content
        sign_up_count_text_view.text = getString(R.string.activity_detail_sign_up_count) + result.signUpCount
        previous_page_image_view.setOnClickListener { finish() }
    }
}
