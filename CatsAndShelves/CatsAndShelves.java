public class CatsAndShelves {
    //https://www.codewars.com/kata/62c93765cef6f10030dfa92b
    public int solution(int start, int finish) {
        int count = 0;
        while (start != finish) {
            if (start + 2 <= finish) {
                start += 2;
                count++;
            } else if (start + 1 <= finish) {
                start++;
                count++;
            }
        }
        return count;
    }
}