import static java.lang.Math.abs;

public class OppositeNumber {
    // https://www.codewars.com/kata/56dec885c54a926dcd001095

    public int opposite(int number) {
        return number < 0 ? abs(number) : number > 0 ? number * -1 : 0;
    }
}