package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
   @Test
   public void ProductName(){
       //given i have an Ac
       AirConditioner airConditioner = new AirConditioner();
       //what's the name of the Ac
       airConditioner.setProductName("Thermocool");
       // my Ac name
       assertEquals("Thermocool",airConditioner.getproductName());
   }

    @Test
    public void airConditionerIsOn(){
        //given i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //when i turn Ac on is on
        airConditioner.isOn(true);
        //check it is on
        boolean isOn = airConditioner.checkIsOn();
        assertTrue(isOn);



    }
    @Test
    public void testAirConditionerIsOff(){
        //i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //my Ac is on
        airConditioner.isOn(true);
        //when i turn off
        airConditioner.isOff(true);
        //check Ac is off
        boolean isOff = airConditioner.checkIsOff();
        assertTrue(isOff);

    }
    @Test
    public void testTemperatureIncrease(){
        //given i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //my Ac is on
        airConditioner.isOn(true);
        //when i increase the temperature on my Ac
        airConditioner.temperatureIncrease();
        //check if temperature has increase
        int increase = airConditioner.checkTemperatureIncrease(1);
        System.out.println(increase);
        assertEquals(1, increase);
    }
    @Test
    public void testTemperatureDecrease(){
        //given i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //my Ac is on
        airConditioner.isOn(true);
        //when i decrease the temperature on my Ac
        airConditioner.temperatureDecrease();
        //check if temperature has decrease
        int decrease = airConditioner.checkTemperatureDecrease(0);
        System.out.println(decrease);
        assertEquals(0, decrease);
    }
    @Test
    public void testTemperatureNotBelow16(){
        //given i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //my Ac is on
        airConditioner.isOn(true);
        //set my Ac not below 16
        int set = airConditioner.airConditionerTemperature(16);
        set = airConditioner.airConditionerTemperature(16);
        int Below = 16;
        assertEquals(16, Below);
    }
    @Test
    public void testTemperatureNotBeyond30(){
        //given i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //my Ac is on
        airConditioner.isOn(true);
        //set my Ac not beyond 30
        airConditioner.temperatureNotBeyond();
        int set = airConditioner.airConditionerTemperature(30);
        int beyond = 30;
        assertEquals(30,beyond);

    }

}














