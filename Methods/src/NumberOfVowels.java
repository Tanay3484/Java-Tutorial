import java.util.Scanner;

public class NumberOfVowels {
    static int numberOfVowels(String st){
        int vowelCount = 0;
        for(char ch:st.toCharArray()){
            if(Character.compare(Character.toLowerCase(ch), 'a')==0 || Character.compare(Character.toLowerCase(ch), 'e')==0 || Character.compare(Character.toLowerCase(ch), 'i')==0 || Character.compare(Character.toLowerCase(ch), 'o')==0 || Character.compare(Character.toLowerCase(ch), 'u')==0){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String inp = input.nextLine();

        System.out.println("Number of vowels in the entered string is : "+numberOfVowels(inp));
    }
}
