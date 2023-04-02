package dictionary.engToAze;

import dictionary.main.DictionariList;
import dictionary.main.DictionaryApp;

import java.util.Map;
import java.util.TreeMap;

public final class EngToAze {

    //Since it is a translation program, this part of the program is given in English ...

    enum Functions {SEARCH, ADD, SHOW, RETURN, EXIT}

    static Map<String, String> dictionary = new TreeMap<>();

    private EngToAze() {
    }

    public static void engToAze() throws IllegalArgumentException {
        while (true) {
            System.out.println("\nChoose fields\n" +
                    "Type 'SEARCH' to search needed word\n" +
                    "Type 'ADD' to add new a word with its translate\n" +
                    "Type 'SHOW' to show all words\n" +
                    "Type 'RETURN' to return main menu\n" +
                    "Type 'EXIT' to end program..\n");
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
                    System.out.println("Program ended...");
                    DictionariList.writeToFile(dictionary);
                    System.exit(0);
                default:
                    throw new IllegalArgumentException("Enter correct field");
            }
        }
    }
}