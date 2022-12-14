package tdd;

public class Baby {

    private int age;

    private int weightInKg;

    private String name;
    //required constructor

    public Baby(int babyWeightAtBirth) {
        weightInKg = babyWeightAtBirth;
    }

    public Baby(String babyNameAtBirth) {
        name = babyNameAtBirth;
    }

    public Baby(String babyNameAtbirth, int babyAtWeight) {
        name = babyNameAtbirth;
    }
}

