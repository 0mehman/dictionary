package dictionary;

import dictionary.azeToEng.AzeToEng;
import dictionary.engToAze.EngToAze;

import java.util.Scanner;

public final class DictionaryApp {
    enum TypeDictionary {AZE, ENG}

    public static Scanner scan = new Scanner(System.in);

    public static void chooseDictionaryType() throws IllegalArgumentException {
        System.out.println("\n***Dictionary***\nChoose directory\n" +
                "Type 'AZE': Azerbaijani to English\n" +
                "Type 'ENG': English to Azerbaijani\n");
        TypeDictionary type = TypeDictionary.valueOf(scan.next().toUpperCase());

        switch (type) {
            case AZE:
                AzeToEng.azeToEng();
                break;
            case ENG:
                EngToAze.engToAze();
                break;

        }
    }
}
