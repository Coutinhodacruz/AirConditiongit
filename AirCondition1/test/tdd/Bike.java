package tdd;

public class Bike {

    public boolean isOn;

    public boolean isOff;

    public boolean isOn (boolean on) {isOn = on; return on;}

    public boolean isOn() {return true;}

    public boolean isOff (boolean off) {isOff = off; return off;}
    public boolean isOff() {return true;}

    public static int Acceleration() {
        return 50;
    }

    public int bikeAcceleration(int rate) {
        return 50;
    }
}
