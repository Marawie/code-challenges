public class PersistentBugger {
    // https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

    public int persistence(long n){
        int count = 0;
        long sum = 1;
        if (n < 10) {
            return 0;
        }
        while (n >= 10) {
            String[] numbs = String.valueOf(n).split("");
            for (String num : numbs) {
                sum *= Integer.parseInt(num);
            }
            n = sum;
            sum = 1;
            count++;
        }
        return count;
    }
}