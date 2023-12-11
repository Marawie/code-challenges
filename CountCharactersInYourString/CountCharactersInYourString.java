import java.util.*;
public class CountCharactersInYourString {
    // https://www.codewars.com/kata/52efefcbcdf57161d4000091/
    public Map<Character, Integer> count(String str) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            characterIntegerHashMap.put(c, characterIntegerHashMap.getOrDefault(c, 0) + 1);
        }
        return characterIntegerHashMap;
    }
}