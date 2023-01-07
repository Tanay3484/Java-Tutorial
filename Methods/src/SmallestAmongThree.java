import java.util.Scanner;

public class SmallestAmongThree{
    static int smallest(int a,int b,int c){
        if(a == b || b==c || a==c){
            return -1;
        }
        else{
            if(a<b && a<c){
                return a;
            }
            else if(b<a && b<c){
                return b;
            }
            else{
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = input.nextInt();

        int result = smallest(num1, num2, num3);
        if(result==-1){
            System.out.println("Two of the three numbers entered are equal. Please enter all unequal numbers");
        }
        else{
            System.out.println("Smallest number out of the three enetered is : "+result);
        }
    }
}