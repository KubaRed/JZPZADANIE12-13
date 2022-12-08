import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList;

    public CarService(){
        this.carList = new ArrayList<>();
    }

    //3
    public List<Car> getAllCars() {
        return this.carList;
    }

    //7
    public Car getTheCheapestCar() {
        return (Car)this.carList.stream().min(Comparator.comparing(Car::getPrice)).get();
    }

    //11
    public List<Car> getCarListOfSpecificProducer(Manufacturer manufacturer) {
        return (List)this.carList.stream().filter((x) -> {
            return x.getManufacturerList().contains(manufacturer);
        }).collect(Collectors.toList());
    }


//1
    public void addCarToList(Car car) {
        carList.add(car);
    }
//5
    public List<Car> productedBefore1999() {
        return carList.stream().filter(x -> x.getDateOfProduction().isBefore(LocalDate.of(1999, 1, 1)))
                .collect(Collectors.toList());
    }
//9
    public List<Car> sortedCarsByPrice(boolean asc) {
        if (asc) {
            return carList.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
        } return carList.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).collect(Collectors.toList());
    }

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


