import java.util.ArrayList;
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
}
