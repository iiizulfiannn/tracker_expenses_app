package com.luckyfriday.treackerexpensesapp.di

import com.luckyfriday.treackerexpensesapp.PinDatastore
import org.koin.dsl.module

val repositoryModule = module {
    single { PinDatastore(context = get()) }
}