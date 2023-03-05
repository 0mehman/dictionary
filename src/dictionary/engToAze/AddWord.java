package dictionary.engToAze;

import dictionary.main.DictionaryApp;

import java.util.Map;

public class AddWord {
    private AddWord() {
    }

    public static void addWord(Map<String, String> dictionary) {
        System.out.println("Enter the word");
        String word = DictionaryApp.scan.next().toLowerCase();
        System.out.println("Enter the translate of the word");
        DictionaryApp.scan.nextLine();
        String translate=DictionaryApp.scan.nextLine().toLowerCase();
        dictionary.put(word, translate);
        System.out.println("Word added successfully");
    }
}
