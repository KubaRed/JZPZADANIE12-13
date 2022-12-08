import java.util.Comparator;
import java.util.List;

//2,6,10
//sprawdzanie czy konkretne auto znajduje się na liście,
public class CarService {
    private List<Car> carList;
//feat 2
    public boolean deleteCar(Car car) {
        return carList.remove(car);
    }
//feat 6
    public Car getTheMostExpensiveCar() {
        List<Car> carsByValue = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(1).toList();
        return carsByValue.get(0);
    }
//feat10
    public boolean ifContains(Car car) {
        return carList.contains(car);
    }

}
