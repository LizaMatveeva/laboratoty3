package Locations;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public class CarPark extends Locations{
    public CarPark(String name) {
        super(name);
    }
    public static class ParkingPlace {
        String name;
        public ParkingPlace(int number, String name) {
            this.name = name;
        }
        public String toString(){
            return name;
        }
    }
}
