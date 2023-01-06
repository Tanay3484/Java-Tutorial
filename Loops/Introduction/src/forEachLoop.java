import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {
        int[] numbers = {4,5,2,3,1};
        int sum = 0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println("Sum of the array "+Arrays.toString(numbers)+" is : "+sum);
    }
}
