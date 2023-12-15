package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;

public class Doctor extends Human implements Ambulance_drive {
    public Doctor(String post){
        this.post = post;}
    @Override
    public void ambulance_drive(Transport transport, String move){}

    @Override
    public void ambulance_deliver(boolean ill, Transport transport, String move, Hospital hospital) {
        if (ill == true){
            System.out.println(post + " на " + transport + " " + move + " пациента в " + hospital + "." );
        }
        else {
            System.out.println(transport + " стоит на месте.");
        }
    }

    @Override
    public void Say(Replicas replica, String move) {

    }

    @Override
    public void See(View view, String move) {

    }
}