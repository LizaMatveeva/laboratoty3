package Enum;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public enum Illness {
    HEALING ("здоров"),
    SICK ("болен");
    private String type;
    Illness (String type){
        this.type = type;}

    public String toString (){
        return type;}
}
