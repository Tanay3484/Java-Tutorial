import java.util.Scanner;

public class UpperPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want : ");
        int rows = input.nextInt();

        int spaces = rows-1;
        for(int i = 1;i<=rows;i++){
            for(int k = 1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }
}
