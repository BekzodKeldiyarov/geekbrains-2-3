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

    public void showWords() {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void addWord(String word) {
        words.add(word);
    }

    public Map showCountOfWords() {
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

        return CountOfWords;
    }

//    public void showUniqueWords() {
//        boolean shown = false;
//        for (String word : CountOfWords.keySet()) {
//            if(word.va)
//            System.out.println(word);
//            for (int i = words.indexOf(word); i < words.size(); i++) {
//                if (word.equals(words.get(i))) {
//                    shown = true;
//                }
//                CountOfWords.put(word, count);
//            }
//        }
//    }


}
