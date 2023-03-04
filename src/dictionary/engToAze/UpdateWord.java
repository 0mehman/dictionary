package dictionary.engToAze;

import dictionary.DictionaryApp;

import java.util.Map;

final class UpdateWord {
    private UpdateWord() {
    }

    public static void update(Map<String, String> dictionary, String key) {
        System.out.println("Enter new translate");
        dictionary.put(key, DictionaryApp.scan.next().toLowerCase());
        System.out.println(key + " - " + dictionary.get(key));
        EngToAze.engToAze();
    }
}
