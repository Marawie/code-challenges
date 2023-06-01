public class EqualSidesOfAnArray {
    //https://www.codewars.com/kata/5679aa472b8f57fb8c000047/

    public int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}