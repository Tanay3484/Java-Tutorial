import java.util.Scanner;

public class MiddleCharacterOfString {
    static String middleChar(String st){
        if(st.length()%2==0){
            int startIndex = (st.length()/2)-1;
            int endIndex = st.length()/2;
            return st.substring(startIndex,endIndex+1);
        }
        else{
            int startIndex = st.length()/2;
            return st.substring(startIndex,startIndex+1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String inp = input.nextLine();

        System.out.println("Middle character of this string is : "+middleChar(inp));
    }
}
