import java.util.Scanner;

public class NumberOfWords {
    static int numberOfWords(String st){
        int wordCount = 0;
        for(char ch:st.toCharArray()){
            if(Character.compare(ch, ' ')==0){
                wordCount++;
            }
        }
        return wordCount+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence : ");
        String inp = input.nextLine();

        System.out.println("Number of words in the entered sentence : "+numberOfWords(inp));
    }
}
