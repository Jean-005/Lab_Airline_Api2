package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight flight1 = new Flight("GER", 2, "2023-01-28", "20:00:00");
        flightService.addNewFlight(flight1);

        Flight flight2 = new Flight("FRA", 200, "2022-09-18", "09:00:00");
        flightService.addNewFlight(flight2);

        Passenger Tom = new Passenger("Tom", "tom@gmail.com");
        passengerService.addNewPassenger(Tom);


        Passenger Tim = new Passenger("Tim", "timm@gmail.com");
        passengerService.addNewPassenger(Tim);

    }
}
