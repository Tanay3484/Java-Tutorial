import java.util.Scanner;

public class LowerPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want : ");
        int rows = input.nextInt();

        for(int i = 1;i<=rows;i++){
            for(int k = 1;k<i;k++){
                System.out.print(" ");
            }
            for(int j = rows;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}