import java.math.BigInteger;
public class LastDigitOfLargeNumber {
//https://www.codewars.com/kata/5511b2f550906349a70004e1/java

    public class Kata {
        public int lastDigit(BigInteger n1, BigInteger n2) {
            BigInteger score = n1.modPow(n2, BigInteger.TEN);
            return score.intValue();
        }
    }
}