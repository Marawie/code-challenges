public class NonConsecutiveNumb {

    // https://www.codewars.com/kata/58f8a3a27a5c28d92e000144
    
public Integer find(final int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] + 1 != array[i + 1]) {
            return array[i + 1];
        }
    }
    return null;
}
// this should work tho, but didn't test it
    public Integer find1(final int[] array) {
        for (int i = 0 ; i< array.length; i++){
            for (int j = 1; j<array.length -1; j++){
                if (array[i] + 1 != array[j]){
                    return array[j];}
            }
        }
        return null;
    }
}
