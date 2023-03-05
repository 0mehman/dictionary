package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;

final class GetWord {
    private GetWord() {
    }

    public static String getWord(Map<String, String> dictionary) {
        System.out.println("Axtarılan sözü daxil et");
        String word = DictionaryApp.scan.next().toLowerCase();
        if (!dictionary.containsKey(word)) {
            System.out.println("Bu söz lüğətdə mövcud deyi");
            return null;
        }
        return word;
    }
}
