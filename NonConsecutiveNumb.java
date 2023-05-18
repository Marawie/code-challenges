public class NonConsecutiveNumb {

    /*
Your task is to find the first element of an array that is not consecutive.
By not consecutive we mean not exactly 1 larger than the previous element of the array.
E.g. If we have an array [1,2,3,4,6,7,8]
then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.*/

// this was my first implement(first think how to solve this), but it doesn't work because Error OutOfBound
    // edit it was good idea but I had to estate array by minus 1 then cannot go out of range
static Integer find(final int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] + 1 != array[i + 1]) {
            return array[i + 1];
        }
    }
    return null;
}

// this should work tho, but didn't test it
    static Integer find1(final int[] array) {
        for (int i = 0 ; i< array.length; i++){
            for (int j = 1; j<array.length -1; j++){
                if (array[i] + 1 != array[j]){
                    return array[j];}
            }
        }return null;
    }

}
