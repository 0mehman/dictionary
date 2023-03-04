package dictionary.engToAze;

import dictionary.main.DictionaryApp;

import java.util.Map;
import java.util.TreeMap;

public final class EngToAze {

    enum Functions {SEARCH, SHOW, RETURN, EXIT}

    static Map<String, String> dictionary = new TreeMap<>();

    private EngToAze() {
    }

    public static void engToAze() throws IllegalArgumentException {
        System.out.println("\nChoose fields\n" +
                "Type 'search' to search needed word\n" +
                "Type 'show' to show all words\n" +
                "Type 'return' to return main menu\n" +
                "Type 'exit' to end program..\n");
        Functions type = Functions.valueOf(DictionaryApp.scan.next().toUpperCase());

        switch (type) {
            case SEARCH:
                SearchWord.search(dictionary);
                break;
            case SHOW:
                ShowAll.showAllList(dictionary);
                break;
            case RETURN:
                DictionaryApp.chooseDictionaryType();
                break;
            case EXIT:
                System.out.println("Program ended...");
                System.exit(0);
            default:
                throw new IllegalArgumentException("Enter correct field");
        }
    }
}
