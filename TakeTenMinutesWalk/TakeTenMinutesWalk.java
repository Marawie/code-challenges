public class TakeTenMinutesWalk {
    //https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
    public boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int stepW = 0;
        int stepE = 0;
        int stepN = 0;
        int stepS = 0;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') {
                stepN++;
            } else if (walk[i] == 's') {
                stepS++;

            } else if (walk[i] == 'w') {
                stepW++;

            } else if (walk[i] == 'e') {
                stepE++;
            }
        }
        if (stepN == 5 && stepS == 5) {
            return true;
        } else if (stepW == 5 && stepE == 5) {
            return true;
        } else if (stepW == 3 && stepE == 3 && stepN == 2 && stepS == 2) {
            return true;
        } else if (stepN == 3 && stepS == 3 && stepW == 2 && stepE == 2) {
            return true;
        } else if (stepN == 4 && stepS == 4 && stepW == 1 && stepE == 1) {
            return true;
        } else if (stepN == 1 && stepS == 1 && stepW == 4 && stepE == 4) {
            return true;
        }
        return false;
    }
}