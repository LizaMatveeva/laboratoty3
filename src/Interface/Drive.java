package Interface;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;

public interface Drive {
    void Drive(Transport transport, String move, Locations location);
    void SlowDown (String move, Transport transport, String move2, Motorbiker motorbiker);
}
