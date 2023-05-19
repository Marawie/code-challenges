package SortArrayAscending;
import java.util.List;
public class SortArrayAscending {
    public List<Integer> ascList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int numbA = list.get(i);
                int numbB = list.get(j);
                if (numbA > numbB) {
                    list.set(i, numbB);
                    list.set(j, numbA);
                }
            }
        }
        return list;
    }
}