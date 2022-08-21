package com.ixsans.modulebridge

import android.content.Context
import com.ixsans.modulebridge.FlutterBridgeActivity

object Bridgeapp {

    fun launch(context: Context) {
        FlutterBridgeActivity.withNewEngine(context)
    }
}