package pl.pjatk.car;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarRestController {

    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(carService.findAll());

    }

    @GetMapping("/build")
    public ResponseEntity<Car> buildCar() {
        return ResponseEntity.ok(carService.buildCar("honda", "civic"));
    }

    @GetMapping ("/find")
    public ResponseEntity<Car> findCar() {
        return ResponseEntity.ok(carService.findById(1L));
    }
}