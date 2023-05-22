public class DisemvowelTrolls {
    // https://www.codewars.com/kata/52fba66badcd10859f00097e/

    public String disemvowel(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}