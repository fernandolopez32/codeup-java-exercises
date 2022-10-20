package vehicles;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle Car = new Vehicle("Honda Civic si");
        System.out.println(Car.getName());
        Car.makeNoise();
        Vehicle genericCar = new Vehicle();
        genericCar.makeNoise();
        System.out.println(genericCar.makeNoise());

        Car ferrari = new Car("Ferrari");
        ferrari.makeNoise();
        ferrari.breakDown();



    }
}
