package com.mapbox.navigation.core.replay.history

import com.google.gson.annotations.SerializedName

/**
 * DTO of ReplayHistory. If you'd like to add a custom event, add it to [events], and
 * pass a [CustomEventMapper] to the [ReplayHistoryMapper].
 *
 * @param historyVersion version of history
 * @param version // todo add docs
 * @param events include custom
 */
data class ReplayHistoryDTO(
    @SerializedName("history_version")
    val historyVersion: String,

    @SerializedName("version")
    val version: String,

    @SerializedName("events")
    val events: List<Any>
)
