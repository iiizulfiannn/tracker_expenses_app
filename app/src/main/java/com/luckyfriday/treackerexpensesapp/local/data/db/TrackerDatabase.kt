package com.luckyfriday.treackerexpensesapp.local.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.luckyfriday.treackerexpensesapp.local.data.dao.UserDao
import com.luckyfriday.treackerexpensesapp.local.data.dto.User

@Database(entities = [User::class], version = 1)
abstract class TrackerDatabase : RoomDatabase() {

    abstract val userDao: UserDao

    companion object {
        fun create(context: Context): TrackerDatabase {
            return Room.databaseBuilder(context, TrackerDatabase::class.java, "tracker")
                .fallbackToDestructiveMigration().build()
        }
    }
}