class Solution {
    public String shiftingLetters(String s, int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 2; i >= 0; i--) {
            // arr[i] = arr[i] + arr[i + 1];
            arr[i] = (arr[i] + arr[i + 1]) % 26;
        }

        int i = 0;
        for (char ch : s.toCharArray()) {
            sb.append((char) ('a' + (ch - 'a' + arr[i++]) % 26));
        }

        return sb.toString();
    }
}