public class Mumbling {
    //https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

    public String accum(String s) {
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            stringBuilder.append(Character.toUpperCase(currentChar));
            for (int j = 0; j < i; j++) {
                stringBuilder.append(Character.toLowerCase(currentChar));
            }
            if (i < length - 1) {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }
}