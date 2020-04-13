package com.mapbox.navigation.navigator

import android.location.Location
import com.mapbox.navigation.base.trip.model.RouteProgress

/**
 * State of trip at particular timestamp
 *
 * @param enhancedLocation user's location
 * @param keyPoints list of predicted locations. Might be empty
 * @param routeProgress [RouteProgress] is progress information
 * @param offRoute *true* if user is off-route, *false* otherwise
 *
 * @see [MapboxNativeNavigator.getStatus]
 */
data class TripStatus(
    val enhancedLocation: Location,
    val keyPoints: List<Location>,
    val routeProgress: RouteProgress,
    val offRoute: Boolean
)
