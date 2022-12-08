import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private LocalDate dateOfProduction;
    private List<Manufacturer> producers;
    private EnumEngine engineType;

    public Car(String name, String model, BigDecimal price, LocalDate dateOfProduction, List<Manufacturer> producers, EnumEngine engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
        this.producers = producers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public List<Manufacturer> getProducers() {
        return producers;
    }

    public void setProducers(List<Manufacturer> producers) {
        this.producers = producers;
    }

    public EnumEngine getEngineType() {
        return engineType;
    }

    public void setEngineType(EnumEngine engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(dateOfProduction, car.dateOfProduction) && Objects.equals(producers, car.producers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, dateOfProduction, producers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
