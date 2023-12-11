public class SortArrayDescending {
    public int[] sortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int numbA = arr[i];
                int numbB = arr[j];
                if (numbB > numbA) {
                    arr[j] = numbA;
                    arr[i] = numbB;
                }
            }
        }
        return arr;
    }
}