public class BouncingBalls {

    // https://www.codewars.com/kata/5544c7a5cb454edb3c000047/java 

    public int bouncingBall(double h, double bounce, double window) {
        int count = 1;
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }

        while (h * bounce > window) {
            h *= bounce;
            count += 2;
        }
        return count;
    }
}
