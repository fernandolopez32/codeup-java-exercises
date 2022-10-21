package vehicles;

public class Garage  {
    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void alarmCascade(Vehicle[] vehicles){
        for(Vehicle vehicle: vehicles){
            vehicle.alarm();
        }
    }
}