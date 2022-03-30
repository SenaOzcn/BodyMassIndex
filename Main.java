import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creat variables
    double weight, height, bmi;
    
    // get data from user
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Enter your height: ");
    height = inp.nextDouble();
    
    System.out.print("Enter your weight(kg): ");
    weight = inp.nextDouble();
    
    // body mass index
    bmi = weight / (height * height);
    System.out.print("Your body mass index is " + bmi);
    }
}
