import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int height = 175 ;
        Scanner Scanner = new Scanner(System.in);
        int heightScan = Scanner.nextInt();

        float weightScan = Scanner.nextFloat();
        int heightSqquared = (int) Math.pow(heightScan,2);get
        float calculateBMI = weightScan / (heightScan * heightScan)*10000;
        float weight = 100;

        float bmi = weight / (height * height)*10000;
        System.out.println("Your BMI is " + bmi);

        if (bmi >=18.5 && bmi <= 24.9){
            System.out.println("Your weight is normal so bmi is good");
        }else {
            System.out.println("Your weight is not normal so bmi is not good");
        }
    }
}
