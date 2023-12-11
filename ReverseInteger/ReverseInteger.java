public class ReverseInteger {
    //https://leetcode.com/problems/reverse-integer/description/

    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) reversed;
    }
}