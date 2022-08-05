import java.util.Scanner;

public class pigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user for input, stores input into variable word
        System.out.print("You give me one word, I give you one pig-latin\n");
        String word = scanner.nextLine();

        // stores first character of input into variable aChar
        char aChar = word.charAt(0);

        // an ugly skip-test
        Boolean skipFirst = true;
        // iterate through the user input word's length, skipping the first character
        for (int i = 0; i < word.length(); i++) {
            if (skipFirst == true) {
                skipFirst = false;
            }
            // after skipping the first character, prints each character
            else {
                System.out.print(word.charAt(i));
            }
        }
        // prints the first character stored in line 12
        System.out.print(aChar);
        // concatenates "-ay" onto the end
        System.out.print("ay");
        scanner.close();
        
        // convertToPigLatin("Kevin");

    }

    // kevin's example playing with strings
    public static String convertToPigLatin(String word) {
        // String temp=word.substring(1);
        // temp=temp+word.charAt(0);
        // temp=temp+"ay";
        // return temp;
        // String temp = word.substring(1);
        StringBuilder sb = new StringBuilder(word);
        sb.deleteCharAt(0); // .append(word.charAt(0))+"ay"
        sb.append(word.charAt(0));
        sb.append("ay");
        return sb.toString();
    }
}