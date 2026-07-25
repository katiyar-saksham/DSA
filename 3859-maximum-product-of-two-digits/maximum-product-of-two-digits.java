class Solution {
    public int maxProduct(int n) {
        List<Integer> lst = new ArrayList<>();
        while (n > 0) {
            lst.add(n % 10);
            n /= 10;
        }
        Collections.sort(lst, Collections.reverseOrder());
        return lst.get(0) * lst.get(1);
    }
}