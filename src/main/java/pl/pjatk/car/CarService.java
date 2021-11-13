package pl.pjatk.car;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        List<Car> CarList = new ArrayList<>();
        Car car = new Car("honda", "civic", "red", 2005, 4);
        CarList.add(car);
        return CarList;
    }

    public Car buildCar(String mark, String model) {
        Car car = new Car(mark, model, "red", 2005, 5);
        return carRepository.save(car);
    }

    public Car addNewCar(Car car) {
        return car;
    }

    public Car findById(Long Id){
        Optional<Car> byId = carRepository.findById(Id);
        if (byId.isPresent()) {
            return byId.get();
        }
        else {
            return null;
        }

    }

    //   public void addExtraWheel(Car car){
    //      if (car.getWheels() < 5){
    //          car.setWheels(car.getWheels() + 1);
//        }
//    }
}
