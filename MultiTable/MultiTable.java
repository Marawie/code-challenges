public class MultiTable {

    // https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08

    public int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
