public class ParseNiceIntFromCharProblem {

    //https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/
    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }
}