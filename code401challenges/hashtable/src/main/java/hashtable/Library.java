package hashtable;

import java.util.Hashtable;

public class Library {

    public String findRepeatedWords(String words) {

        String[] word = words.split("\\W+");

        Hashtable<String, String> table = new Hashtable<>();

        for(String w: word) {
            if(table.contains(w.toLowerCase())) {
                return w.toLowerCase();
            }
            table.put(w.toLowerCase(), w.toLowerCase());

        }

        return "No repeated Words";
    }


}
