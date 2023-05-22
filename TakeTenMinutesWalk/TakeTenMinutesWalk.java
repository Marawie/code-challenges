public class TakeTenMinutesWalk {
    //https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
    public boolean isValid(char[] walk) {
        int lengthOfWalk = walk.length;
        if (lengthOfWalk != 10) {
            return false;
        }
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            switch (walk[i]) {
                case 'n' -> y++;
                case 'e' -> x++;
                case 's' -> y--;
                case 'w' -> x--;
            }
        }
        return x == 0 && y == 0;
    }
}