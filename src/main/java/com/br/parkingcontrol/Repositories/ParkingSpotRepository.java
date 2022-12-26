package com.br.parkingcontrol.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.parkingcontrol.Models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartamentAndBlock(String apartament, String block);
}
