package com.kaizencoder.streakly.data.local.entity

import androidx.room.Entity
import com.kaizencoder.streakly.domain.model.Frequency
import java.time.DayOfWeek

@Entity
data class RecurrenceRule(var frequency: Frequency,
                          var interval: Int,
                          var daysOfWeek: List<DayOfWeek>)
