public class GetTheMiddleCharacter {
    //https://www.codewars.com/kata/56747fd5cb988479af000028
    public String getMiddle(String word) {
        int length = word.length();
        int middleIndex = word.length() / 2;
        if (length <= 2) {
            return word;
        } else if (length % 2 == 0) {
            return word.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return word.substring(middleIndex, middleIndex + 1);
        }
    }
}