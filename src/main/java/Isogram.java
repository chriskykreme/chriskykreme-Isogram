import java.util.*;
public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
        boolean isIsogram = true;
        // Create and populate a HashMap of alphabetic characters, and number of occureneces in string
        Map<Character, Integer> alphabet = new HashMap<Character, Integer>(); 
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.put(ch, 0);
        }

        // Add number of occurences per letter to the HashMap
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            int val = alphabet.get(c);
            alphabet.put(c, val+1);
        }

        // Retrieve list of keys and if the number of any occurence is > 1
        // it is not an isogram so return false
        Collection<Integer> values = alphabet.values();
        for (Integer value : values) {
            if (value > 1) {
                isIsogram = false;
            }
        }
        
        return isIsogram;

    }
}
