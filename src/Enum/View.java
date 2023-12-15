package Enum;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public enum View {
    MOVEMENT ("оживленное движение."),
    TRANSPORT ("машины, велосипеды, мотоциклы."),
    MOTORBIKER ("мотоциклист."),
    AMBULANCE_CAR ("скорая помощь"),
    PUDDLE ("громадная лужа под машиной"),
    DRAW_PLACE ("надпись: `Место доктора Крида`");
    private String view;
    View (String view){
        this.view = view;
    }
    public String toString(){
        return view;
    }
}
