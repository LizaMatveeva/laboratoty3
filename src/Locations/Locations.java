package Locations;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
abstract public class Locations {
    protected String name;
    public Locations(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
