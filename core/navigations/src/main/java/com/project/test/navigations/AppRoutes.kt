package com.project.test.navigations

import androidx.core.net.toUri

object AppRoutes {

    object FeatureFirst {
        val Entry = R.id.actionFeatureFirst
        object Deeplink {
            val FRAGMENT_FIRST = "example.feature://first".toUri()
        }
    }

    object FeatureSecond {
        val Entry = R.id.actionFeatureSecond
        object Deeplink {
            val FRAGMENT_SECOND = "example.feature://second".toUri()
        }

    }

}