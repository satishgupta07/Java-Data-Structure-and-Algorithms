package Day7_LinkedListAndArrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int i=0, j=height.length-1, leftMax = 0, rightMax = 0, water = 0;
        while(i < j) {
            if(height[i] <= height[j]) {
                leftMax = Math.max(leftMax, height[i]);
                water += leftMax - height[i];
                i++;
            }
            else {
                rightMax = Math.max(rightMax, height[j]);
                water += rightMax - height[j];
                j--;
            }
        }
        return water;
    }
}
