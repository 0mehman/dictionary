package dictionary.engToAze;

import dictionary.main.DictionaryApp;

import java.util.Map;

final class GetWord {
    private GetWord() {
    }

    public static String getWord(Map<String, String> dictionary) {
        System.out.println("Enter searched word");
        String word = DictionaryApp.scan.next().toLowerCase();
        if (!dictionary.containsKey(word)) {
            System.out.println("This word doesn't exist in dictionary");
            return null;
        }
        return word;
    }
}
