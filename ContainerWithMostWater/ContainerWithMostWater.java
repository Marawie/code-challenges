public class ContainerWithMostWater {
    //https://leetcode.com/problems/container-with-most-water/

    public int maxArea(int[] height) {
        int lowerHeight, higherHeight;
        int lengthOfDiagram = height.length;
        if (lengthOfDiagram == 2) {
            lowerHeight = height[0];
            higherHeight = height[1];
            if (lowerHeight < higherHeight || lowerHeight == higherHeight) {
                return lowerHeight * lowerHeight;
            } else return higherHeight * higherHeight;
        }
        int currentlyWaterContainer = Math.min(height[0], height[1]) * 2;

        for (int i = 0; i < lengthOfDiagram; i++) {
            for (int j = i + 1; j < lengthOfDiagram; j++) {
                if (Math.min(height[i], height[j]) * (j - i) > currentlyWaterContainer) {
                    currentlyWaterContainer = Math.min(height[i], height[j]) * (j - i);
                }
            }
        }
        return currentlyWaterContainer;
    }
}