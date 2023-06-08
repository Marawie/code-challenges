public class FindTheIndexOfTheSecondOccurrence {
    //https://www.codewars.com/kata/63f96036b15a210058300ca9

    public int secondSymbol(String str, char c) {
        int index = 0, count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            count++;
            if (str.charAt(i) == c) {
                index++;
            }
            if (index == 2) {
                return count - 1;
            }
        }
        return count - 1;
    }
}