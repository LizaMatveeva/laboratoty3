package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public class Luice extends Human implements Drive {



    public Luice  (String name, String post){
        this.name = name;
        this.post = post;
    }
    public void Feeling(boolean overtake){
        if (overtake){
            System.out.println(name + " чувствует " + Feel.IRRITATION + ".");}
        else {
            System.out.println(name + " ничего не чувствует. ");
        }
    }
    public void Feeling2(View view){
        if (View.AMBULANCE_CAR == view){
            System.out.println(name + " чувствует " + Feel.ALERTNESS + ".");}
    }

    @Override
    public void Drive(Transport transport, String move, Locations location) {
        this.location = location;
        System.out.println(name + " " + move + " на " + transport + " в " + location +".");
    }

    @Override
    public void SlowDown(String move, Transport transport, String move2, Motorbiker motorbiker) {
        System.out.println(name + " " + move + " " + transport + " и " + move2 + " " + motorbiker  + "а.");
    }


    @Override
    public void Say(Replicas replica, String move) {
        System.out.print("-" + replica + ", - " + move + " " + name + ".");
    }
    public void Say(Replicas replica){
        System.out.println("-" + replica + ".");
    }
    public void Say(Replicas replica, Feel type, String move){
        System.out.print("-" + replica + ", - " + move + " " + name + " без особого " + type + ".");
    }

    @Override
    public void See(View view, String move) {
        if (View.MOTORBIKER == view){
            System.out.println("Мотоциклист помахал рукой, но " + name + " " + move + " " + view);}
        else if (View.AMBULANCE_CAR == view){
            System.out.println("На стоянке лазарета " + name + " " + move + " " +view + ".");
        }
        else {
            System.out.println(name + " " + move + " " + view);
        }
    }

    @Override
    public void Enter(Hospital hospital, String move){
        System.out.println(name + " " + move + " в " + hospital + ".");
    }
    public void See(TypeDay type, View view, String move){
        System.out.println(name + " в свой " + type + " " + move + " " + view + ".");
    }

    public void See(String move){
        System.out.println(name + " " + move + " Джоан Чарлтон.");
    }
    public void Parking(View view, String move, Transport transport, CarPark.ParkingPlace Place, int number){
        if (View.DRAW_PLACE == view){
            System.out.println(name + " " + move + " " + transport + " на " + Place + " номер " + number + ", где виднелась " + view + ".");
        }

    }
}

