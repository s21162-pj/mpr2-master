package pl.pjatk.car;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> findAll() {
        List<Car> CarList = new ArrayList<>();
        Car car = new Car("honda", "civic", "red", 2005, 4);
        CarList.add(car);
        return CarList;
    }

    public Car buildCar(String mark, String model) {
        Car car = new Car(mark, model, "red", 2005, 5);
        return car;

    }


    //   public void addExtraWheel(Car car){
    //      if (car.getWheels() < 5){
    //          car.setWheels(car.getWheels() + 1);
//        }
//    }
}
