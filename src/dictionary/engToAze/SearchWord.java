package dictionary.engToAze;

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
        System.out.println("\nType 'UPDATE' to update current translate\n" +
                "Type 'DELETE' to delete current word\n" +
                "Type 'RETURN' to return main menu\n" +
                "Type 'EXIT' to end program..\n");
        SearchFields searched = SearchFields.valueOf(DictionaryApp.scan.next().toUpperCase());

        switch (searched) {
            case UPDATE:
                UpdateWord.update(dictionary, key);
                break;
            case DELETE:
                System.out.println(key + " is deleted");
                dictionary.remove(key);
            case RETURN:
                return;
            case EXIT:
                System.out.println("Program ended...");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Enter correct field");
        }
    }
}
