public class DigitDigit {
    //https://www.codewars.com/kata/546e2562b03326a88e000020/

    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            double squaredDigit = Math.pow(digit, 2);
            result.append(squaredDigit);
        }
        return Integer.parseInt(result.toString());
    }
}