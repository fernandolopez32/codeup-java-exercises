package vehicles;

public class Vehicle {
    //Create a vehicles.Vehicle class with two properties: a name instance variable and a makeNoise() method.
    //
    //


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String makeNoise(){
       return  "Room room";
    }

    public Vehicle(){}

    public Vehicle (String name){
         this.setName(name);
    }





}
