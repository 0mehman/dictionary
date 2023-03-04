package dictionary.azeToEng;

import java.util.Map;

final class ShowAll {

    private ShowAll() {
    }

    public static void showAllList(Map<String, String> dictionary) {
        System.out.println("Lüğətdə olan bütün sözlər:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        AzeToEng.azeToEng();
    }
}
