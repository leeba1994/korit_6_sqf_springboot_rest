package com.study.rest.service;

import com.study.rest.entity.Car;
import com.study.rest.repository.CarRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    // final -> 상수: 무조건 한번은 초기화를 해줘야 한다.
//    private final CarRepository carRepository;
//    private CarRepository carRepository2;
//    private final String name;
//
//    public CarService(CarRepository carRepository) {
//        this.carRepository = carRepository;
//        this.name = "김준일";
//    }
//
//    public CarService(CarRepository carRepository, CarRepository carRepository2) {
//        this.carRepository = carRepository;
//        this.carRepository2 = carRepository2;
//        this.name = "김준일";
//    }

    //    public CarService() {
//
//    }

    public Car getCar(String model) {
        return carRepository.findCarByModel(model);
    }
}
