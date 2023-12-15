package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public class Patient extends Human{
    private boolean ill;

    public Patient(String post){
        this.post = post;

    }
    public void Ill(int randomhealthy){
        if (randomhealthy == 0){
            this.ill = false;}
        else{
            this.ill = true;
            System.out.println(post + " " + Illness.SICK + ".");
        }
    }
    public void Relax(String move, TypeDay type, String emotion){
        System.out.println(post + " " + emotion + " " + move + ", когда был " + type + ".");
    }
    public boolean getIll(){
        return ill;}

    @Override
    public void Say(Replicas replica, String move) {

    }

    @Override
    public void See(View view, String move) {

    }

    public String toString(){
        return post;}
}