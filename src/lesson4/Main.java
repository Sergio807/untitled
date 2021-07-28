package lesson4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Cat", "Dog", "Bear", "Monkey", "Cat", "Fox", "Wolf", "Bear", "Turtle", "Fox"};

        HashMap<String, Integer> uniqWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (uniqWords.containsKey(words[i])) {
                uniqWords.put(words[i], uniqWords.get(words[i]) + 1);}
            else {uniqWords.put(words[i], 1);}
            
        }
        System.out.println(uniqWords);
    }
}