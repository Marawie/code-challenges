public class JadenCasingStrings {
    // https://www.codewars.com/kata/5390bac347d09b7da40006f6

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                sb.append(c);
            } else {
                if (capitalizeNext) {
                    c = Character.toUpperCase(c);
                    capitalizeNext = false;
                } else {
                    c = Character.toLowerCase(c);
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }
}