package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;

final class SearchWord {
    enum SearchFields {UPDATE, DELETE, RETURN, EXIT}

    private SearchWord() {
    }

    public static void search(Map<String, String> dictionary) throws IllegalArgumentException {
        String key = GetWord.getWord(dictionary);
        if (key == null) return;
        System.out.println(key+" - "+dictionary.get(key));
        System.out.println("\nMövcud tərcüməni yeniləmək üçün 'UPDATE':\n" +
                "Cari sözü silmək üçün 'DELETE':\n" +
                "Əsas menuya qayıtmaq üçün 'RETURN':\n" +
                "Proqramdan çıxmaq üçün 'EXIT': daxil edin..\n");
        SearchFields searched = SearchFields.valueOf(DictionaryApp.scan.next().toUpperCase());

        switch (searched) {
            case UPDATE:
                UpdateWord.update(dictionary, key);
                break;
            case DELETE:
                System.out.println(key + " sözü silindi");
                dictionary.remove(key);
            case RETURN:
                return;
            case EXIT:
                System.out.println("Programın sonu...");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Düzgün melumat daxil edin");
        }
    }
}
