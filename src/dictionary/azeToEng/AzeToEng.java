package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;
import java.util.TreeMap;

public final class AzeToEng {

    //Tərcümə proqramı olduğu üçün proqramın bu hissəsi Azərbaycanca verilmişdir...

    enum Functions {SEARCH, ADD, SHOW, RETURN, EXIT}

    static Map<String, String> dictionary = new TreeMap<>();

    private AzeToEng() {
    }

    public static void azeToEng() throws IllegalArgumentException {
        while (true) {
            System.out.println("\nChoose fields\n" +
                    "Axtarılan söz üçün 'SEARCH' yaz\n" +
                    "Yeni söz əlavə etmək üçün 'ADD' yaz\n" +
                    "Bütün sözləri görmək üçün 'SHOW' yaz\n" +
                    "Əsas menuya qayıtmaq üçün 'RETURN' yaz\n" +
                    "Proqramdan çıxmaq üçün 'EXIT' yaz..\n");
            Functions type = Functions.valueOf(DictionaryApp.scan.next().toUpperCase());
            switch (type) {
                case SEARCH:
                    SearchWord.search(dictionary);
                    break;
                case ADD:
                    AddWord.addWord(dictionary);
                    break;
                case SHOW:
                    ShowAll.showAllList(dictionary);
                    break;
                case RETURN:
                    DictionaryApp.chooseDictionaryType();
                    break;
                case EXIT:
                    System.out.println("Proqram sona çatdı...");
                    System.exit(0);
                default:
                    throw new IllegalArgumentException("Düzgün məlumat daxil edin");
            }
        }
    }
}