package com.kaizencoder.streakly.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import com.kaizencoder.streakly.data.local.entity.HabitEntity

@Dao
interface HabitDao {

    @Insert
    suspend fun insertHabit(habitEntity: HabitEntity)

}