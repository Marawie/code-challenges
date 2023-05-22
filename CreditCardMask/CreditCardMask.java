public class CreditCardMask {
    // https://www.codewars.com/kata/5412509bd436bd33920011bc/

    public String maskify(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        if (length <= 3) {
            return str;
        } else
            for (int i = 0; i < length - 4; i++) {
                sb.append("#");
            }
        sb.append(str, length - 4, length);
        return sb.toString();
    }
}