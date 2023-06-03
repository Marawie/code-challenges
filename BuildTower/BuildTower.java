public class BuildTower {
    //https://www.codewars.com/kata/576757b1df89ecf5bd00073b

    public String[] towerBuilder(int nFloors) {
        String[] towerBuild = new String[nFloors];
        int spaceCount = nFloors - 1;
        int starCount = 1;
        for (int i = 0; i < nFloors; i++) {
            StringBuilder floor = new StringBuilder();
            for (int j = 0; j < spaceCount; j++) {
                floor.append(" ");
            }
            for (int j = 0; j < starCount; j++) {
                floor.append("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                floor.append(" ");
            }
            towerBuild[i] = floor.toString();
            spaceCount--;
            starCount += 2;
        }
        return towerBuild;
    }
}