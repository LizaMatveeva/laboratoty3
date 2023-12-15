import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
public class Main{
    public static void main (String[] args) {
        Luice luice = new Luice("Луис", "доктор");
        Joan joan = new Joan("Джоан Чарлтон", "медсестра", 50, "седая");
        Transport car = new Transport(false, "машина");
        University university = new University("университет");
        Motorbiker motorbiker = new Motorbiker("мотоциклист");
        Transport ambulance_car = new Transport(true, "скорая помощь");
        Hospital hospital = new Hospital("лазарет");
        Patient patient = new Patient("Пациент");
        Doctor doctor = new Doctor("Доктор");
        Stiv stiv = new Stiv("Стив Мастертон", "помощник врача");
        Patient girl = new Patient("Девушка");
        int number = (int)(Math.random() * 24 + 1);
        CarPark.ParkingPlace parkingPlace = new CarPark.ParkingPlace(number, "место");

        luice.Drive(car, "ехал", university);
        luice.See(View.MOVEMENT, "увидел");
        luice.See(View.TRANSPORT, "увидел");
        luice.SlowDown("затормозил", car, "пропустил", motorbiker);

        int overandom = (int) (Math.random() * 2);
        motorbiker.Overtake(overandom);
        boolean a = motorbiker.getOvertake();

        luice.Feeling(a);
        luice.See(View.MOTORBIKER, "не обратил внимание на");
        luice.See(View.AMBULANCE_CAR, "не увидел");
        luice.Feeling2(View.AMBULANCE_CAR);
        luice.Enter(hospital, "зашел");
        if (Hospital.Ward.getCount() == 2) {
            System.out.println("В госпитале есть две палаты.");
        }
        hospital.ward.ward();
        hospital.ward2.ward();
        if (hospital.operatingRoom.getReal()) {
            System.out.println("В госпитале отсутсвует операционная.");
        }

        int randomhealthy = (int) (Math.random() * 2);
        patient.Ill(randomhealthy);
        boolean b = patient.getIll();
        doctor.ambulance_deliver(b, ambulance_car, "доставил", hospital);
        stiv.Demonstrate("показывал", hospital);
        stiv.Talk("посвятил");
        stiv.Feeling3(Feel.PRIDE, "Чувствуя", "рассказал");
        for (int i = 0; i < 38; i++) {
            ambulance_car.ambulance_drive(ambulance_car, "выехала");
        }
        System.out.println(ambulance_car + " выехала на выезд " + ambulance_car.getCount_drive() + " раз.");
        luice.See(TypeDay.FIRSTDAY, View.AMBULANCE_CAR, "не увидел");
        luice.Parking(View.DRAW_PLACE, "припарковал", car, parkingPlace, number);
        luice.Enter(hospital, "поспешил");
        luice.See("застал");
        joan.Take_temperature(girl, "мерила", Temperature.temperature);
        girl.Relax("обгорела", TypeDay.SUNNY, "хорошо");
        luice.Say(Replicas.HELLO, "сказал");
        luice.Say(Replicas.CAR);
        joan.Say(Replicas.DRAMA, "сказала");
        joan.TakeOff_temperature(girl, "вынула", Temperature.thermometer);
        stiv.See(View.PUDDLE, "увидел");
        stiv.Say(Replicas.RADIATOR, "сказал");
        luice.Say(Replicas.REGRET, Feel.REGRET, "сказал");
        luice.Say(Replicas.WHEN);
        joan.Lauth("засмеялась");
    }
}