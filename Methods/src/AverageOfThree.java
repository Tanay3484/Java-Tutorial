import java.util.Scanner;

public class AverageOfThree {
    static double average(double a,double b,double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();

        System.out.print("Enter the first number : ");
        double num2 = input.nextDouble();

        System.out.print("Enter the first number : ");
        double num3 = input.nextDouble();

        System.out.println("The average of the 3 numbers entered is : "+String.format("%.3f",average(num1, num2, num3)));
    }
}
