package in.waghmare.generators;


/**
 * Created by df on 10/25/16.
 */
public class SubsetGenerator {
    public static void main(String[] args) {
        String input = "abcdoplklkjljkjkjkjuhuhu";
        int length = input.length();
        char[] charArray = input.toCharArray();
        int max = 1 << length;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < length; j++) {
                if (((i >> j) & 1) == 1) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print("\n");
        }
    }
}
