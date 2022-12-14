
import java.util.Scanner;

public class Temperature{

    public static void main(String[] arg){

        Scanner data = new Scanner(System.in);

        System.out.println("Enter final Temperature");

        double finalTemperature = data.nextDouble();

        System.out.println("Enter initial Temperature");

        double initialTemperature = data.nextDouble();

        System.out.println("Enter weight of water");

        double weight = data.nextDouble();

        double result = weight * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("% .3f %n",result);



    }
}