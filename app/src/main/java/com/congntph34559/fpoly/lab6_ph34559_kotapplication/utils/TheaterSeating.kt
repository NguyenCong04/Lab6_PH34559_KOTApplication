package com.congntph34559.fpoly.lab6_ph34559_kotapplication.utils

import com.congntph34559.fpoly.lab6_ph34559_kotapplication.model.entities.Seat
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.model.entities.SeatStatus
import kotlin.random.Random


fun createTheaterSeating(
    totalRows: Int,
    totalSeatsPerRow: Int,
    aislePositionInRow: Int,
    aislePositionInColumn: Int
): List<Seat> {
    val seats = mutableListOf<Seat>()
    for (rowIndex in 0 until totalRows) {
        for (seatIndex in 1..totalSeatsPerRow) {
            val adjustedRowIndex = if (rowIndex >=
                aislePositionInRow
            ) rowIndex - 1 else rowIndex
            val adjustedSeatIndex = if (seatIndex >= aislePositionInColumn)
                seatIndex - 1 else seatIndex
            val isAisleRow = rowIndex == aislePositionInRow
            val isAisleColumn = seatIndex ==
                    aislePositionInColumn
            val status = when {
                isAisleRow || isAisleColumn -> SeatStatus.AISLE
                else -> if (Random.nextInt(0, 99) % 2 == 0)
                    SeatStatus.BOOKED else SeatStatus.EMPTY
            }
            seats.add(
                Seat(
                    row = 'A' + adjustedRowIndex,
                    number = adjustedSeatIndex,

                    status = status

                )
            )
        }
    }
    return seats
}