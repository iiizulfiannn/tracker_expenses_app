package com.luckyfriday.treackerexpensesapp.di

import com.luckyfriday.treackerexpensesapp.local.data.datastore.PinDatastore
import com.luckyfriday.treackerexpensesapp.local.data.repositories.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { PinDatastore(context = get()) }
    single { UserRepository(userDao = get(), coroutineContext = get()) }
}