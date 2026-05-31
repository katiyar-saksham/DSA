class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long Mass = mass;

        for (int a : asteroids) {
            if (Mass >= a) {
                Mass += a;
            } else
                return false;
        }

        return true;
    }
}