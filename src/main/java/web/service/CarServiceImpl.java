package web.service;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component

public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Audi", "RS Q8", 1));
        cars.add(new Car("BMW", "M5", 6));
        cars.add(new Car("Subaru", "Impreza WRX", 5));
        cars.add(new Car("Nissan", "Skyline", 8));
        cars.add(new Car("Toyota", "Mark II", 7));
    }

    @Override
    public List<Car> numberOfCars(int size) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; (i < size) & (i < 5); i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
