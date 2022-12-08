import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService(){
        this.carList = new ArrayList<>();
    }

    //2
    public void removeCarFromList(Car car){
        carList.remove(car);
    }

    //6
    public Car getMostExpensiveCar(){
        return (Car)this.carList.stream().max(Comparator.comparing(Car::getPrice)).get();
    }

    //10
    public boolean checkIfCarIsOnTheList(Car car) {
        return this.carList.contains(car);
    }
}
