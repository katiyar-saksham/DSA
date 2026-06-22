class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a']++;
        }
        int b = arr['b' - 'a'];
        int a = arr['a' - 'a'];
        int l = arr['l' - 'a'] / 2;
        int o = arr['o' - 'a'] / 2;
        int n = arr['n' - 'a'];

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}