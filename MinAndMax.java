import java.util.Arrays;

public class MinAndMax {

// Implements two different way to do this
    public int max(int[] list) {
        int max = Arrays.stream(list).max().getAsInt();
        return max;
    }

    public int min(int[] list) {
        int min = Arrays.stream(list).min().getAsInt();
        return min;
    }

    public int min1(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max2(int[] list) {
        Arrays.sort(list);
        return list[list.length-1];
    }
}
