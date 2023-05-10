package com.khirod.presentation.dto;

import java.util.List;

public class BookingList {

    private List<Booking> bookingList;

    private int pageNumber;

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public BookingList(List<Booking> bookingList, int pageNumber, int pageSize) {
        this.bookingList = bookingList;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private int pageSize;
}
