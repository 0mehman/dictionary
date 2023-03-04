package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;
import java.util.TreeMap;

public final class AzeToEng {

    enum Functions {AXTAR, GOSTER, QAYIT, CIX}

    static Map<String, String> dictionary = new TreeMap<>();

    private AzeToEng() {
    }

    public static void azeToEng() throws IllegalArgumentException {
        System.out.println("\nChoose fields\n" +
                "Axtarılan söz üçün 'AXTAR' yaz\n" +
                "Bütün sözləri görmək üçün 'GOSTER' yaz\n" +
                "Əsas menuya qayıtmaq üçün 'QAYIT' yaz\n" +
                "Proqramdan çıxmaq üçün 'CIX' yaz..\n");
        Functions type = Functions.valueOf(DictionaryApp.scan.next().toUpperCase());

        switch (type) {
            case AXTAR:
                SearchWord.search(dictionary);
                break;
            case GOSTER:
                ShowAll.showAllList(dictionary);
                break;
            case QAYIT:
                DictionaryApp.chooseDictionaryType();
                break;
            case CIX:
                System.out.println("Program sona çatdı...");
                System.exit(0);
            default:
                throw new IllegalArgumentException("Düzgün melumat daxil edin");
        }
    }
}
