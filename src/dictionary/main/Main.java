package dictionary.main;

public class Main {
    public static void main(String[] args) {
//        Map<String, String> dictionary = new TreeMap<>();
//        dictionary.put("hello", "salam");
//        dictionary.put("hi", "salam");
//        dictionary.put("bye", "sagol");
//        dictionary.put("goodbye", "sagol");
//
//        System.out.println( dictionary.keySet());
//        System.out.println(dictionary);
        try {
            DictionaryApp.chooseDictionaryType();
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }
}