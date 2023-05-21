public class GetTheMiddleCharacter {
    //https://www.codewars.com/kata/56747fd5cb988479af000028
    public String getMiddle(String word) {
        int middleIndex = word.length() / 2;
        if (word.length() <= 2){
            return word;
        }
        else if (word.length() % 2 == 0) {
            return word.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return word.substring(middleIndex, middleIndex + 1);
        }
    }
}