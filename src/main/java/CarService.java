import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void addCarToList(Car car) {
        carList.add(car);
    }

    public List<Car> productedBefore1999() {
        return carList.stream().filter(x -> x.getDateOfProduction().isBefore(LocalDate.of(1999, 1, 1)))
                .collect(Collectors.toList());
    }

    public List<Car> sortedCarsByPrice(boolean asc) {
        if (asc) {
            return carList.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
        } return carList.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).collect(Collectors.toList());
    }
}

