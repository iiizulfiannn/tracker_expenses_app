package com.luckyfriday.treackerexpensesapp.local.data.repositories

import com.luckyfriday.treackerexpensesapp.local.data.dao.UserDao
import com.luckyfriday.treackerexpensesapp.local.data.dto.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class UserRepository(
    private val userDao: UserDao,
    private val coroutineContext: CoroutineContext
) {
    fun getUsers(): Flow<User?> = userDao.getUsers()

    suspend fun insertUser(user: User) {
        withContext(coroutineContext) {
            userDao.insertUser(user)
        }
    }
}