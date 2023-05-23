public class SpinWords {
    // https://www.codewars.com/kata/5264d2b162488dc400000001
    public String spinWords(String sentence) {
        StringBuilder finalFormOfSentece = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() >= 5) {
                StringBuilder reversedWord = new StringBuilder();
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord.append(word.charAt(i));
                }
                finalFormOfSentece.append(reversedWord);
            } else {
                finalFormOfSentece.append(word);
            }
            finalFormOfSentece.append(" ");
        }
        return finalFormOfSentece.toString().trim();
    }
}