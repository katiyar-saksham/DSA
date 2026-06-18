class Solution {
    public double angleClock(int hour, int minutes) {
        double ha = (hour % 12) * 30 + 0.5 * minutes;
        double ma = 6 * minutes;

        double diff = Math.abs(ma - ha);

        return Math.min(diff, 360 - diff);
    }
}