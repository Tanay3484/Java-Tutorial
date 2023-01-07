import java.util.Scanner;

public class SumOfDigits{
    static int sumOfDigits(int x){
        int num = x;
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("Sum of digits of the number is : "+sumOfDigits(num));
    }
}