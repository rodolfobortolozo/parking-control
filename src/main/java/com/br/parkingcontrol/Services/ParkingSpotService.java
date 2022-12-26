package com.br.parkingcontrol.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.parkingcontrol.Models.ParkingSpotModel;
import com.br.parkingcontrol.Repositories.ParkingSpotRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    ParkingSpotRepository parkingSpotRepository;

    ParkingSpotService(ParkingSpotRepository parkingSportRepository) {
        this.parkingSpotRepository = parkingSportRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber){
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartamentAndBlock(String apartament, String block){
        return parkingSpotRepository.existsByApartamentAndBlock(apartament, block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable){
        return parkingSpotRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id){
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void delete (ParkingSpotModel parkingSpotModel){
        parkingSpotRepository.delete(parkingSpotModel);
    }
}
