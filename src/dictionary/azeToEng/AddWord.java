package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;

public class AddWord {
    private AddWord() {
    }

    public static void addWord(Map<String, String> dictionary) {
        System.out.println("Sözü daxil edin");
        String word = DictionaryApp.scan.next().toLowerCase();
        System.out.println("Həmin sözün tərcüməsini daxil edin");
        DictionaryApp.scan.nextLine();
        String translate=DictionaryApp.scan.nextLine().toLowerCase();
        dictionary.put(word, translate);
        System.out.println("Söz uğurla əlavə edildi");
    }
}
