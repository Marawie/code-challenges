import java.util.ArrayList;
import java.util.List;

public class HighestAndLowest {
    //https://www.codewars.com/kata/554b4ac871d6813a03000035/

    public String highAndLow(String numbers) {
        String[] numbsStr = numbers.split(" ");
        String firstNumb = numbsStr[0];
        int maxNumb = Integer.parseInt(firstNumb);
        int minNumb = Integer.parseInt(firstNumb);
        List<Integer> numbParsed = new ArrayList<>();
        for (String n : numbsStr) {
            int numb = Integer.parseInt(n);
            numbParsed.add(numb);
        }
        for (Integer numb : numbParsed) {
            if (numb < minNumb) {
                minNumb = numb;
            }
            if (numb > maxNumb) {
                maxNumb = numb;
            }
        }
        return maxNumb + " " + minNumb;
    }
}