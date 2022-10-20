package vehicles;

public class Car extends Vehicle {
    // Then create a more specific vehicle subclass, such as Motorcycle, vehicles.Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class.

    @Override
    public String makeNoise() {
        return "room room";
    }


    // Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest. Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.
}
