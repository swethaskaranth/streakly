package com.kaizencoder.streakly.data.local.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kaizencoder.streakly.domain.model.Priority
import com.kaizencoder.streakly.domain.model.TaskStatus

@Entity
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String?,
    val status: TaskStatus,
    val dueDate: String,
    val isRecurring: Boolean,
    val reminderRequired: Boolean,
    val priority: Priority,
    @Embedded val recurrenceRule: RecurrenceRule)
