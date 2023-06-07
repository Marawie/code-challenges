import java.util.ArrayList;
import java.util.List;
public class SoManyPermutations {
    //https://www.codewars.com/kata/5254ca2719453dcc0b00027d

    public List<String> singlePermutations(String s) {
        List<String> stringList = new ArrayList<>();
        generatePermutation("", s, stringList);
        return stringList.stream().distinct().toList();
    }

    public void generatePermutation(String prefix, String remaining, List<String> stringList) {
        int length = remaining.length();
        if (length == 0) {
            stringList.add(prefix);
        } else
            for (int i = 0; i < length; i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String remain = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutation(newPrefix, remain, stringList);
            }
    }
}