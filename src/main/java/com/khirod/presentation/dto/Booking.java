package com.khirod.presentation.dto;


import java.time.Instant;

public class Booking {

    private String bookingId;
    private Instant startDate;
    private Instant endDate;

    public Booking(String bookingId, Instant startDate, Instant endDate) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }
}
