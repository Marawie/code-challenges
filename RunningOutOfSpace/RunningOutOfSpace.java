public class RunningOutOfSpace {
    // https://www.codewars.com/kata/56576f82ab83ee8268000059/train/java
    public String[] spacey(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }
}