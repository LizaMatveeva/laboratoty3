package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public class Stiv extends Human{
    public Stiv(String name, String post){
        this.name = name;
        this.post = post;
    }


    @Override
    public void Say(Replicas replica, String move) {
        System.out.println("-" + replica + ", - " + move + " " + name + ".");
    }

    @Override
    public void See(View view, String move) {
        System.out.println(name + " " + move + " " + view + ".");
    }

    @Override
    public void Demonstrate(String move, Hospital hospital) {
        System.out.println(name + ", " + post + ", " + move + " Луису " + hospital + ".");
    }

    @Override
    public void Talk(String move){
        System.out.println(name + " " + move + " его в историю последних двух лет.");
    }
    public void Feeling3(Feel feel, String move1, String move2){
        if (Feel.PRIDE == feel){
            System.out.print(move1 + " " + feel + ", " + name + " " + move2 + " что, ");
        }
    }
}
