package tdd;

public class PetrolPurchase {

    private String PetrolStationName;

    private String PetrolStationLocation;

    private String PetrolType;

    private double PricePerLiter;

    private int QuantityPerLiter;

    public PetrolPurchase() {
    }


    public void setPetrolStationName(String name) {
        this.PetrolStationName = name;

    }
    public String getpetrolStationName() {
        return PetrolStationName;
    }

    public void setPetrolStationLocation(String name) {

        this.PetrolStationLocation =name;
    }
    public String getPetrolStationLocation(){

        return PetrolStationLocation;
    }

    public void setPetrolType(String name) {

        this.PetrolType = name;
    }
    public String getPetrolType(){

        return PetrolType;
    }

    public void setPricePerLiter(double price) {
        this.PricePerLiter = price;
    }

    public double getPricePerLiter() {
        return PricePerLiter;
    }

    public int QuantityPerLiter(int QuantityPerLiter) {
        return (int) (QuantityPerLiter / PricePerLiter);
    }
}