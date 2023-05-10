package com.khirod.presentation.rest;

import com.khirod.presentation.dto.Booking;
import com.khirod.presentation.dto.BookingList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/rest")
public class BookingsController {

    private final Random random = new Random();

    @RequestMapping(value = "/bookings",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<BookingList> getBookings(@RequestParam("userId") String userId) {
        Supplier<Integer> numBookingsSupplier = () -> 1;
        //Supplier<Integer> numBookingsSupplier = () -> random.nextInt(1, 10);

        Integer numBookings = numBookingsSupplier.get();
        List<Booking> bookings = IntStream.range(0, numBookingsSupplier.get()).mapToObj(id ->
                new Booking(userId + "-" + id, Instant.now(), Instant.now())
        ).toList();
        BookingList bookingList = new BookingList(bookings, 1, numBookings);
        return ResponseEntity.ok(bookingList);
    }

}
