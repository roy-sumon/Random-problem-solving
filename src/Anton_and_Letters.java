import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        String lettersPart = input.substring(1, input.length() - 1).trim();
        if (lettersPart.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] lettersArray = lettersPart.split(", ");

        Set<String> distinctLetters = new HashSet<>();

        for (String letter : lettersArray) {
            distinctLetters.add(letter);
        }
        System.out.println(distinctLetters.size());
    }
}
