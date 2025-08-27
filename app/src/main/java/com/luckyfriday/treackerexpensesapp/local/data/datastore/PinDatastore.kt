package com.luckyfriday.treackerexpensesapp.local.data.datastore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PinDatastore(private val context: Context) {
    private val Context.dataStore by preferencesDataStore(name = "pin_code")

    suspend fun savePin(pinCode: Int) {
        context.dataStore.edit { preferences ->
            preferences[PIN_CODE] = pinCode
        }
    }

    val readPin: Flow<Int>
        get() = context.dataStore.data.map { preferences ->
            preferences[PIN_CODE] ?: 0
        }

    companion object {
        private val PIN_CODE = intPreferencesKey("pin_code")
    }
}