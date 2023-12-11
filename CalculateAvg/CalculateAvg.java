import java.util.Arrays;
public class CalculateAvg {
    // https://www.codewars.com/kata/57a2013acf1fa5bfc4000921

    public double findAverage(int[] array) {
        double avg = Arrays.stream(array).sum() / (double) array.length;
        return array.length == 0 ? 0 : avg;
    }

    public double findAverageAnotherWay(int[] array) {
        double sum = 0;
        for (Integer numb : array) {
            sum += numb;
        }
        double avg = sum / array.length;
        return array.length == 0 ? 0 : avg;
    }
}