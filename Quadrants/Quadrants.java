public class Quadrants {
    //https://www.codewars.com/kata/643af0fa9fa6c406b47c5399/train/java

    public int quadrant(int x, int y) {
        return x>0 && y>0? 1 : x>0 && y<0? 4 : x<0 && y>0? 2 : x<0 && y<0?  3 : 0;
    }
}