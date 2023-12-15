package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;

public class Motorbiker extends Human implements Drive {
    private Boolean overtake;
    public Motorbiker (String name){
        this.name = name;
    }
    @Override
    public void Drive(Transport transport, String move, Locations location) {
    }

    @Override
    public void SlowDown(String move,Transport transport, String move2, Motorbiker motorbiker){}
    public void Overtake(int overandom){
        if (overandom == 0){
            this.overtake = false;
        }
        else {
            this.overtake = true;
            System.out.println(name + " хочет, чтобы его пропустили.");
        }
    }
    public boolean getOvertake(){
        return overtake;
    }

    @Override
    public void Say(Replicas replica, String move) {

    }

    @Override
    public void See(View view, String move) {

    }
}
