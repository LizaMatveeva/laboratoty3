package Interface;
import Enum.*;
import Interface.*;
import People.*;
import Locations.*;

public interface Ambulance_drive {
    void ambulance_drive(Transport transport, String move);
    void ambulance_deliver(boolean ill, Transport transport, String move, Hospital hospital);
}
