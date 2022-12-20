package com.thurainx.wechat_app.network.cloud_firestore

import android.graphics.Bitmap

interface CloudFireStoreApi {
    fun registerUser(
        name: String,
        phone: String,
        password: String,
        dob: String,
        gender: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    )

    fun loginUser(
        phone: String,
        password: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    )

    fun uploadProfilePicture(
        phone: String,
        bitmap: Bitmap?, onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    )

}