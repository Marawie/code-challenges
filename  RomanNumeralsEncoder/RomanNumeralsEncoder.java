import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class RomanNumeralsEncoder {
    //https://www.codewars.com/kata/51b62bf6a9c58071c600001b/

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> romanNumeralMap = new HashMap<>();
        romanNumeralMap.put(1, "I");
        romanNumeralMap.put(4, "IV");
        romanNumeralMap.put(5, "V");
        romanNumeralMap.put(9, "IX");
        romanNumeralMap.put(10, "X");
        romanNumeralMap.put(40, "XL");
        romanNumeralMap.put(50, "L");
        romanNumeralMap.put(90, "XC");
        romanNumeralMap.put(100, "C");
        romanNumeralMap.put(400, "CD");
        romanNumeralMap.put(500, "D");
        romanNumeralMap.put(900, "CM");
        romanNumeralMap.put(1000, "M");
        List<Integer> listOfValues = new ArrayList<>(romanNumeralMap.keySet());
        listOfValues.sort(Collections.reverseOrder());
        for (int key : listOfValues) {
            while (n >= key) {
                sb.append(romanNumeralMap.get(key));
                n -= key;
            }
        }
        return sb.toString();
    }
}