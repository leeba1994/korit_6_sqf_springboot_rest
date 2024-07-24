package com.study.rest.controller;

import com.study.rest.entity.Car;
import com.study.rest.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class CarController {

    private final  CarService carService;

//    public CarController(CarService carService) {
//        this.carService = carService;
//    }


    @ResponseBody
    @GetMapping("/car")
    public Car getCar(@RequestParam String model) {
        return carService.getCar(model);
    }
}

/*
* 요청 GET - /car?model=K5 아니면 쏘나타 요청을 날리면
* CarEntity         -> model, color
*
* CarRepository     -> Car findCarByModel(String model)
*           -> List<Car>
               -> index0: Car(model: "쏘나타", color: "화이트")
*              -> index1: Car(model: "K5", color: "블랙")
*
* CarService            -> Car getCar(String model)
*
* CarController         -> Car getCar(@RequestParam String model)
*
* CarController > CarService > CarRepository
* */
