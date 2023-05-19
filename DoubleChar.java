public class DoubleChar {
// https://www.codewars.com/kata/56b1f01c247c01db92000076

    public String doubleChar(String s){
        StringBuilder stringBuilder = new StringBuilder();
        char[] stringToChar = s.toCharArray();
        for (char c : stringToChar){
            stringBuilder.append(c).append(c);
        }
        return stringBuilder.toString();
    }
}