package dictionary.main;

public class Main {
    public static void main(String[] args) {
        try {
            DictionaryApp.chooseDictionaryType();
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }
}