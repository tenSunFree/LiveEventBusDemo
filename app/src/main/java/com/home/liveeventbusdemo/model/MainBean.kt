package com.home.liveeventbusdemo.model

import com.google.gson.annotations.SerializedName

data class MainBean(
    @SerializedName("results")
    val results: List<Result>
) {
    data class Result(
        @SerializedName("avatarImageUrl")
        val avatarImageUrl: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("area")
        val area: String,
        @SerializedName("content")
        val content: String,
        @SerializedName("appointment_count")
        val appointmentCount: String,
        @SerializedName("sign_up_count")
        val signUpCount: String
    )
}