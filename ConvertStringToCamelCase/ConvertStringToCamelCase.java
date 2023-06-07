public class ConvertStringToCamelCase {
    //https://www.codewars.com/kata/517abf86da9663f1d2000003/

    public String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = s.split("[-_]");
        sb.append(strArray[0]);
        for (int i = 1; i < strArray.length; i++) {
            String word = strArray[i];
            if (!word.isEmpty()) {
                char c = Character.toUpperCase(word.charAt(0));
                sb.append(c).append(word.substring(1));
            }
        }
        return sb.toString().replaceAll("[-_]" , "");
    }
}