package Interface;
import Enum.*;
import Interface.*;
import People.*;

public interface Temperature {
    String temperature = "температура";
    String thermometer = "термометр";
    void Take_temperature(Patient patient, String move, String temperature);
    void TakeOff_temperature(Patient patient, String move, String thermometer);
}
