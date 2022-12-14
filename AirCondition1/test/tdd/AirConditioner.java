package tdd;

public class AirConditioner {

    private boolean isOn;

    private boolean isOff;
    private String productName;
    public void setProductName(String name) {
       this.productName = name;
    }

    public String getproductName() {
        return productName;
    }

    public void isOn(boolean on) {
       isOn = on;
    }

    public boolean checkIsOn() {
        return isOn;
    }

    public void isOff(boolean off) {
        isOff = off;
    }

    public boolean checkIsOff() {
        return isOff;
    }

    public void temperatureIncrease () {

    }

    public int checkTemperatureIncrease(int rate) {
        return rate;
    }

    public void temperatureDecrease() {
    }

    public int checkTemperatureDecrease(int rate) { return rate; }

    public int airConditionerTemperature(int rate) {return rate;}

    public void temperatureNotBeyond() {
    }


}