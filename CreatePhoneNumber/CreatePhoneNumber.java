public class CreatePhoneNumber {
    //https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java

    public String createPhoneNumber(int[] numbers) {
        String format = new String("(xxx) xxx-xxxx");
        for (int i = 0; i < numbers.length; i++) {
            format = format.replaceFirst("x", String.valueOf(numbers[i]));
        }
        return format;
    }
}