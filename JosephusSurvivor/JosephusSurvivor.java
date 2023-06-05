import java.util.ArrayList;
import java.util.List;
public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> listOfPeople = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            listOfPeople.add(i);
        }
        int index = 0;
        while (listOfPeople.size() > 1) {
            index = (index + k - 1) % listOfPeople.size();
            listOfPeople.remove(index);
        }
        return listOfPeople.get(0);
    }
}