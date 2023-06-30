import java.util.ArrayList;
import java.util.List;
public class FindFirstAndLastPositionOfElementInSortedArray {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    public int[] searchRange(int[] numbs, int target) {
        List<Integer> numbsInTarget = new ArrayList<>();
        List<Integer> listToCheckThatIsNumbEqualsToTarget = new ArrayList<>();
        int numbsArrayLength = numbs.length;
        if (numbsArrayLength == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < numbsArrayLength; i++) {
            if (numbs[i] != target) {
                listToCheckThatIsNumbEqualsToTarget.add(numbs[i]);
            }
            if (listToCheckThatIsNumbEqualsToTarget.size() == numbsArrayLength) {
                return new int[]{-1, -1};
            }
        }
        for (int i = 0; i < numbsArrayLength; i++) {
            if (numbs[i] == target) {
                numbsInTarget.add(i);
            }
        }
        int lengthOfFinalArrayTarget = numbsInTarget.size();
        int[] arr = new int[lengthOfFinalArrayTarget];
        for (int i = 0; i < lengthOfFinalArrayTarget; i++) {
            arr[i] = numbsInTarget.get(i);
        }
        if (arr.length == 1) {
            return new int[]{arr[0], arr[0]};
        }
        if (arr.length >= 3) {
            return new int[]{arr[0], arr[arr.length - 1]};
        }
        return arr;
    }
}