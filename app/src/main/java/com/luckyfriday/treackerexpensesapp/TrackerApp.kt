package com.luckyfriday.treackerexpensesapp

import android.app.Application
import com.luckyfriday.treackerexpensesapp.di.cacheModule
import com.luckyfriday.treackerexpensesapp.di.repositoryModule
import com.luckyfriday.treackerexpensesapp.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TrackerApp : Application {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@TrackerApp)
            modules(listOf(cacheModule, viewModule, repositoryModule))
        }
    }

}