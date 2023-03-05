package dictionary.engToAze;

import java.util.Map;

final class ShowAll {

    private ShowAll() {
    }

    public static void showAllList(Map<String, String> dictionary) {
        System.out.println("All word this dictionary contains");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
