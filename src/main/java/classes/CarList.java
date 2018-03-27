package classes;

import java.util.ArrayList;

/**
 * Created by Сергей on 21.07.2016.
 */
public class CarList {
    ArrayList<Car> cars = new ArrayList<Car>();

    public CarList() {
        cars.add(new Car(1, "Toyota", "green"));
        cars.add(new Car(2, "Honda", "red"));
        cars.add(new Car(3, "Mazda", "blue"));
    }
}
