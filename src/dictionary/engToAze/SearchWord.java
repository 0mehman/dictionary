package dictionary.engToAze;

import dictionary.DictionaryApp;

import java.util.Map;

final class SearchWord {
    enum SearchFields {UPDATE, DELETE, RETURN, EXIT}

    private SearchWord() {
    }

    public static void search(Map<String, String> dictionary) throws IllegalArgumentException {

        String key = GetWord.getWord(dictionary);
        System.out.println("\nEnter searched fields\n" +
                "Type 'update' to update current translate\n" +
                "Type 'delete' to delete current word\n" +
                "Type 'return' to return main menu\n" +
                "Type 'exit' to end program..\n");
        SearchFields searched = SearchFields.valueOf(DictionaryApp.scan.next().toUpperCase());

        switch (searched) {
            case UPDATE:
                UpdateWord.update(dictionary, key);
                break;
            case DELETE:
                System.out.println(key + " is deleted");
                dictionary.remove(key);
            case RETURN:
                EngToAze.engToAze();
                break;
            case EXIT:
                System.out.println("Program ended...");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Enter correct field");
        }
    }
}
