package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    @Test
    public void BikeIsOn(){
        //given i have a Bike
        Bike bike = new Bike();
        //when i turn on my Bike
        bike.isOn();
        //check if it is on
        boolean isOn = bike.isOn();
        assertTrue(isOn);
    }
    @Test
    public void BikeOff(){
        //given i have a Bike
        Bike bike = new Bike();
        //when i turn my Bike off
        bike.isOff();
        //check if my bike is off
        boolean isOff = bike.isOff();
        assertTrue(isOff);
    }
    @Test
    public void BikeAcceleration(){
        //given i have a bike
        Bike bike =  new Bike();
        //when i turn on my bike
        bike.isOn();
        //i want to accelerate my bike
        int Acceleration = bike.Acceleration();
        int set = bike.bikeAcceleration(50);
        float acceleration;
        assertEquals(50, Acceleration);

    }
}

