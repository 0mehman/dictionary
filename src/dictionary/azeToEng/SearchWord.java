package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;

final class SearchWord {
    enum SearchFields {YENILE, SIL, QAYIT, CIX}

    private SearchWord() {
    }

    public static void search(Map<String, String> dictionary) throws IllegalArgumentException {

        String key = GetWord.getWord(dictionary);
        System.out.println("\nSeçilmiş əməliyyatı daxil edin\n" +
                "Mövcud tərcüməni yeniləmək üçün 'YENILE'\n" +
                "Cari sözü silmək üçün 'SİL'\n" +
                "Əsas menuya qayıtmaq üçün 'QAYIT'\n" +
                "Proqramdan çıxmaq üçün 'CIX' ...yaz..\n");
        SearchFields searched = SearchFields.valueOf(DictionaryApp.scan.next().toUpperCase());

        switch (searched) {
            case YENILE:
                UpdateWord.update(dictionary, key);
                break;
            case SIL:
                System.out.println(key + " sözü silindi");
                dictionary.remove(key);
            case QAYIT:
                AzeToEng.azeToEng();
                break;
            case CIX:
                System.out.println("Programın sonu...");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Düzgün melumat daxil edin");
        }


    }
}
