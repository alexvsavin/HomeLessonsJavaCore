package homeTask4;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] words = {"Cat", "Dog", "Robot", "Human", "Dog", "Monkey", "Dog", "Human","Kangaroo","Cat"};
        HashMap<String, Integer> wordsWithoutRepeats = new HashMap<>();

        for (int i = 0; i < words.length; i++)
            if (wordsWithoutRepeats.containsKey(words[i])) {
                wordsWithoutRepeats.put(words [i], wordsWithoutRepeats.get(words[i]) + 1);
            } else {
                wordsWithoutRepeats.put(words [i], 1);
            }

        System.out.println(wordsWithoutRepeats);

     }
}