package web.Service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("Lada", "Priora", 2015),
            new Car("BMW", "X5", 2017),
            new Car("Lada", "Granta", 2019),
            new Car("Audi", "Q5", 2022),
            new Car("Honda", "Civic", 2024)
    );

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
