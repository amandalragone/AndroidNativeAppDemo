package com.amandalragone.androidnativeappdemo

import android.app.Application
import com.walmartlabs.ern.container.ElectrodeReactContainer

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        ElectrodeReactContainer.initialize(
            this,
            ElectrodeReactContainer.Config()
        )
    }
}