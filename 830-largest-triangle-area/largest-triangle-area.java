class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints - 2; i++) {
            for (int j = i + 1; j < numPoints - 1; j++) {
                for (int k = j + 1; k < numPoints; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    double area = calculateArea(x1, y1, x2, y2, x3, y3);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs(0.5 * (x1 * (y2 - y3) +
                              x2 * (y3 - y1) +
                              x3 * (y1 - y2)));
    }
}
