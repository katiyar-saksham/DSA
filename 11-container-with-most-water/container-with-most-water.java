class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;

        int area = (right - left) * Math.min(height[left], height[right]);

        while (left < right) {
            int area2 = (right - left) * Math.min(height[left], height[right]);
            area = Math.max(area, area2);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}