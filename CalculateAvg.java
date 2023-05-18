import java.util.Arrays;

public class CalculateAvg {

    //Write a function which calculates the average of the numbers in a given list.
    //Note: Empty arrays should return 0.
    public double find_average1(int[] array){
        double avg = Arrays.stream(array).sum() / (double) array.length;
        return array.length == 0 ? 0 : avg;
    }

    public static double find_average2(int[] array){
        double sum = 0;
        for (Integer numb : array){
            sum += numb;
        }
        double avg = sum / array.length;
    return array.length == 0? 0 : avg;
    }


}
