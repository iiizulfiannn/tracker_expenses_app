package com.luckyfriday.treackerexpensesapp.di

import com.luckyfriday.treackerexpensesapp.local.data.db.TrackerDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val cacheModule = module {
    single { TrackerDatabase.create(androidApplication()) }
    single { get<TrackerDatabase>().userDao }
}