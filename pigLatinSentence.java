import java.util.Scanner;

public class pigLatinSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompts user for input
        System.out.println("Enter a sentence to be converted to Pig Latin!");
        //stores input into sentence
        String sentence = scanner.nextLine();
        //calls encode method, passing sentence
        encode(sentence);

    }

    public static void encode(String sentence) {
        //creates stringbuilder that will act as workspace for sentence
        StringBuilder sb = new StringBuilder();
        //split sentence along whitespaces
        for(String outputLatin:sentence.split(" ")){
            //append blocks between spaces into stringbuilder, skips first letter (put at end) and adds piglatin
            sb.append(outputLatin.substring(1)+outputLatin.charAt(0)+"ay"+" ");
            //ran out of time trying to find punctuation component, preliminary google findings
            //planning to check stringbuilder-1 result for special character, if found exit, else returns sb
            if (outputLatin.matches("[^A-Za-z0-9 ]")){
                System.out.println("Punctuation included.");
            }
        }
        //prints stringbuilder
        System.out.println(sb);
    }
}
