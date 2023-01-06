import java.util.Scanner;

public class Diamond{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want : ");
        int rows = input.nextInt();
        System.out.println();
        //upper half
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

        //lower half
        for(int i = 1;i<=rows;i++){
            for(int k = 1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j = rows;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}