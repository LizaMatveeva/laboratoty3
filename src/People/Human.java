package People;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public abstract class Human {
    protected String name;
    protected String post;
    protected Locations location;
    public abstract void Say(Replicas replica, String move);

    public abstract  void See(View view, String move);
    protected void Demonstrate(String move, Hospital hospital) {}
    protected void Enter(){}
    protected void Talk(String move){}
    public String toString(){
        return  name;
    }

    protected void Enter(Hospital hospital, String move){}

}