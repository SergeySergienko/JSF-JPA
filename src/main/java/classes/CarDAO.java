package classes;

public class CarDAO {
    public Car selectById(int id) {
        for (Car car : new CarList().cars) {
            if (car.getId() == id) return car;
        }
        return null;
    }

    public Car selectByModel(String model) {
        for (Car car : new CarList().cars) {
            if (car.getModel().equals(model)) return car;
        }
        return null;
    }

    public Car selectByColor(String color) {
        for (Car car : new CarList().cars) {
            if (car.getColor().equals(color)) return car;
        }
        return null;
    }
}
