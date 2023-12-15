package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public class Joan extends Human implements Temperature{
    int age;
    String hair_color;
    public Joan(String name, String post, int age, String hair_color){
        this.name = name;
        this.post = post;
        this.age = age;
        this.hair_color = hair_color;
    }

    @Override
    public void Take_temperature(Patient post, String move, String temperature) {
        System.out.println(this.name + " " + move + " " + temperature + " " + post + " в джинсах.");
    }

    @Override
    public void TakeOff_temperature(Patient patient, String move, String thermometer) {
        System.out.println(name + " " + move + " " + thermometer + " изо рта " + patient + ".");
    }
    @Override
    public void Say(Replicas replica, String move) {
        System.out.print("-" + replica + ", - " + move + " " + name + ".");
    }

    @Override
    public void See(View view, String move) {
    }
    public void Lauth(String move){
        System.out.println(name + " " + move + ".");
    }
}
