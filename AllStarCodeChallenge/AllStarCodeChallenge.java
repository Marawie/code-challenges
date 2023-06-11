public class AllStarCodeChallenge {
    //https://www.codewars.com/kata/586560a639c5ab3a260000f3/

    public String[] rotate(String text) {
        int length = text.length();
        String[] rotatedWords = new String[length];
        StringBuilder rotatedWord = new StringBuilder(text);
        for (int i = 0; i < length; i++) {
            char firstChar = rotatedWord.charAt(0);
            rotatedWord.deleteCharAt(0);
            rotatedWord.append(firstChar);
            rotatedWords[i] = rotatedWord.toString();
        }
        return rotatedWords;
    }
}