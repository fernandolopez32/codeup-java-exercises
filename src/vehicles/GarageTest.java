package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.setVehicles(new Vehicle[4]);
        Truck truck = new Truck("F250");
        Car muscleCar = new Car("Challenger");
        Car jdmDaily = new Car("Skyline");
        Car luxury = new Car("Rolls Royce");
    }
}
