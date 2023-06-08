import java.math.BigDecimal;
public class MultiplyStrings {
    //https://leetcode.com/problems/multiply-strings/description/
    public String multiply(String num1, String num2) {
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);
        BigDecimal sum = bigDecimal1.multiply(bigDecimal2);
        return String.valueOf(sum);
    }
}