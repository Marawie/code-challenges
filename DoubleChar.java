public class DoubleChar {
// if ["Hello World"] should be [hheelllloo wwoorrlldd]
    public static String doubleChar(String s){
        StringBuilder stringBuilder = new StringBuilder();
        char[] stringToChar = s.toCharArray();
        for (char c : stringToChar){
            stringBuilder.append(c).append(c);
        }
       return stringBuilder.toString();
    }

}
