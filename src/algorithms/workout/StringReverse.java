package algorithms.workout;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        var text = "brazil";
        procedural(text);
        framework(text);
        functional(text);
    }

    private static void functional(String text) {
        var reversed = text.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
        System.out.println("Functional Reversed: " + reversed);
    }

    private static void framework(String text) {
        var reversed = new StringBuilder().append(text).reverse();
        System.out.println("Framework Reversed: " + reversed);
    }

    private static void procedural(String text) {
        var characters = text.toCharArray();
        var reversed = new StringBuilder();
        for (int i = (characters.length - 1); i >= 0; i--) {
            reversed.append(characters[i]);
        }
        System.out.println("Procedural Reversed: " + reversed);
    }
}
