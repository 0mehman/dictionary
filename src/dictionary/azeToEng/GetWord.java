package dictionary.azeToEng;

import dictionary.DictionaryApp;

import java.util.Map;

final class GetWord {
    private GetWord() {
    }

    public static String getWord(Map<String, String> dictionary) {
        System.out.println("Axtarılan sözü daxil et");
        String word = DictionaryApp.scan.next().toLowerCase();
        if (!dictionary.containsKey(word)) {
            System.out.println("Bu söz lüğətdə mövcud deyil\nZəhmət olmasa bu sözün tərcüməsini yazın");
            String newWord = DictionaryApp.scan.next().toLowerCase();
            dictionary.put(word, newWord);
            System.out.println(word + " - " + newWord);
        }
        return word;
    }
}
