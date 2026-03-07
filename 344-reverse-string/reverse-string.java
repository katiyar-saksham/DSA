class Solution {
    public void reverseString(char[] s) {
        reverse(0, s.length-1, s);
    }

    private void reverse(int l, int r, char[] s) {
        if (l >= r) {
            return;
        }

        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        reverse(l + 1, r - 1, s);
    }
}