package com.example.intercom_test_app

import android.app.Application
import io.maido.intercom.IntercomFlutterPlugin


class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        // Add this line with your keys
        IntercomFlutterPlugin.initSdk(this, appId = "appId", androidApiKey = "androidApiKey")
    }
}
