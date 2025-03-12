package com.kaizencoder.streakly.data.local.entity

import androidx.room.PrimaryKey
import com.kaizencoder.streakly.domain.model.Frequency

data class HabitEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String?,
    val frequency: Frequency,
    val reminderRequired: Boolean,
    val lastCompleted: String,
    val currentStreak: String,
    val longestStreak: String,
    val startDate: String
)
