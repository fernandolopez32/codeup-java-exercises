package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle[] vehiclesGarage = (new Vehicle[4]);
        Truck truck = new Truck("F250");
        Car muscleCar = new Car("Challenger");
        Car jdmDaily = new Car("Skyline");
        Car luxury = new Car("Rolls Royce");
        vehiclesGarage[0] = jdmDaily;
        vehiclesGarage[1] = truck;
        vehiclesGarage[2] = muscleCar;
        vehiclesGarage[3] = luxury;

        garage.setVehicles(vehiclesGarage);
        garage.alarmCascade();
        System.out.println(garage.getVehicles()[0].getName());
        System.out.println(garage.getVehicles()[1].getName());
        System.out.println(garage.getVehicles()[2].getName());
        System.out.println(garage.getVehicles()[3].getName());
    }


}
