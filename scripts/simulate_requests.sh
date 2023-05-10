#!/bin/bash

for i in {1..1000}
do
   curl --location 'http://localhost:8080/rest/bookings?userId=khirod' -s -o /dev/null -w  "%{time_total}\n" >> response_times.txt & 
done
