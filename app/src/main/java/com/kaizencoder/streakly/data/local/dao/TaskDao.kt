package com.kaizencoder.streakly.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import com.kaizencoder.streakly.data.local.entity.TaskEntity

@Dao
interface TaskDao {

    @Insert
    suspend fun insertTask(taskEntity: TaskEntity)
}