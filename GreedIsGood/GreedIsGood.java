public class GreedIsGood {
    //https://www.codewars.com/kata/5270d0d18625160ada0000e4/

    public int greedy(int[] dice) {
        int[] counts = new int[7];
        for (int num : dice) {
            counts[num]++;
        }
        int score = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                if (i == 1) {
                    score += 1000;
                } else {
                    score += i * 100;
                }
                counts[i] -= 3;
            }
            if (i == 1) {
                score += counts[i] * 100;
            } else if (i == 5) {
                score += counts[i] * 50;
            }
        }
        return score;
    }
}