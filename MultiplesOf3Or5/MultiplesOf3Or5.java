import java.util.ArrayList;
import java.util.List;
public class MultiplesOf3Or5 {
    //https://www.codewars.com/kata/514b92a657cdc65150000006

    public int solution(int number) {
        int sum = 0;
        if (number <= 0) {
            return 0;
        }
        List<Integer> multiples = new ArrayList<>();
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }
        for (int num : multiples) {
            sum += num;
        }
        return sum;
    }
}