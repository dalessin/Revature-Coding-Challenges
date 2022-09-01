public class FizzBuzz {
    public static void main(String[] args) {
        String fizzBuzzTest;
        fizzBuzzTest = fizz(15);
         System.out.println(fizzBuzzTest);
    }
    //ran out of time, again -- struggle with meeting time windows
    private static String fizz(int number) {
        String values = "";
        // StringBuilder sb = new StringBuilder();

        for (int i = 1; i < number+1; i++) {
            Boolean divided = true;
            if (i % 3 == 0) {
                // sb.append("fizz, ");
                System.out.println("fizz, ");
                divided = false;
            }
            if (i % 5 == 0) {
                // sb.append("buzz, ");
                System.out.println("buzz, ");
                divided = false;
            }
            if (divided) {
                // sb.append(i);
                System.out.println(i);
            }
        }
        return values;
    }
}