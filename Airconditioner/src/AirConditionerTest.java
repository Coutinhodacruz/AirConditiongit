

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void testAirConditionerIsOn(){
        //given i have an Ac
        AirConditioner airConditioner = new AirConditioner();
        //when i turn Ac on is on
        airConditioner.isOn();
        //check it is on
        boolean isOn =airConditioner.checkIsOn();
        assertEquals(true, isOn);



    }
}
