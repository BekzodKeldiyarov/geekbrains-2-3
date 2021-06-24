package com.bekzodkeldiyarov.firstTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {
    List<String> words;
    Map<String, Integer> CountOfWords;

    public Words() {
        this.words = new ArrayList<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public Map showCountOfWords() {
        System.out.println("All words with counted number repeated in map");
        CountOfWords = new HashMap<>();
        for (String word : words) {
            int count = 0;
            for (int i = words.indexOf(word); i < words.size(); i++) {
                if (word.equals(words.get(i))) {
                    count++;
                }
                CountOfWords.put(word, count);
            }
        }
        System.out.println(CountOfWords);
        System.out.println("----------------------------------------");
        return CountOfWords;
    }

    // Не самый верный код, но работающий
    public void showUniqueWords() {
        System.out.println("All unique words in map");

        for (Map.Entry<String, Integer> word : CountOfWords.entrySet()) {
            int count = word.getValue();
            if (count == 1) {
                System.out.println(word.getKey());
            } else if (word.getValue() > 1) {
                while (count != 1) {
                    count--;
                }
                System.out.println(word.getKey());
            }
        }
        System.out.println("----------------------------------------");
    }


}
