package com.bekzodkeldiyarov.firstTask;

public class WordsTest {

    public void start() {
        com.bekzodkeldiyarov.firstTask.Words words = new com.bekzodkeldiyarov.firstTask.Words();
        words.addWord("cigarette");
        words.addWord("summit");
        words.addWord("sticky");
        words.addWord("tone");
        words.addWord("cap");
        words.addWord("summit");
        words.addWord("mosquito");
        words.addWord("bottle");
        words.addWord("candle");
        words.addWord("combine");
        words.addWord("mosquito");
        words.addWord("cigarette");

//        words.showWords();
        words.showUniqueWords();
        words.showCountOfWords();
    }
}
