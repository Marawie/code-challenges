import java.util.*;
public class FindTheUniqueNumber {
    //https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
    public  double findUniq(double[] arr) {
        Map<Double, Integer> countMap = new HashMap<>();
        for (double num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}