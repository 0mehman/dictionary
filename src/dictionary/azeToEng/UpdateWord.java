package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;

final class UpdateWord {
    private UpdateWord() {
    }

    public static void update(Map<String, String> dictionary, String key) {
        System.out.println("Yeni tərcüməni daxil edin:");
        DictionaryApp.scan.nextLine();
        String translate = DictionaryApp.scan.nextLine().toLowerCase();
        dictionary.put(key,translate);
        System.out.println(key + " - " + translate);
    }

}
