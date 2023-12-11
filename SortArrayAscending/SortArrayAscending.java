public class SortArrayAscending {
    public int[] ascArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int numbA = arr[i];
                int numbB = arr[j];
                if (numbA > numbB) {
                arr[i] = numbB;
                arr[j] = numbA;
                }
            }
        }
        return arr;
    }
}
