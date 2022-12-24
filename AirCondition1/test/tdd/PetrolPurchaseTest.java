package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PetrolPurchaseTest {

    @Test
    void PetrolStationName(){
        //test
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        //set PetrolPurchaseName
        petrolPurchase.setPetrolStationName("Total Filling Station");
        //PetrolPurchaseName
        assertEquals("Total Filling Station",petrolPurchase.getpetrolStationName());

    }
    @Test
    void PetrolStationLocation(){
        //test
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        //set location
        petrolPurchase.setPetrolStationLocation("Jibowu");
        //PetrolPurchaseLocation
        assertEquals("Jibowu",petrolPurchase.getPetrolStationLocation());
    }
    @Test
    void PetrolType(){
        //test
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        //setPetrolType
        petrolPurchase.setPetrolType("Fuel");
        //PetrolTypes
        assertEquals("Fuel",petrolPurchase.getPetrolType());
    }
    @Test
    void PricePerLiter(){
        //test
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        // setPricePerLiter
        petrolPurchase.setPricePerLiter(195.290);
        //PricePerLiter
        assertEquals(195.290,petrolPurchase.getPricePerLiter());
    }
    @Test
    void QuantityPerLiter(){
        //test
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        //The QuantityPerLiter
        int divide = petrolPurchase.QuantityPerLiter(100);
        //QuantityPerLiter
        assertEquals(2147483647,petrolPurchase.QuantityPerLiter(100));

}

}
