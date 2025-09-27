class Solution {
    public String fractionToDecimal(int num, int den) {
        // Handle sign of the result
        if (num == 0) return "0"; // Edge case: 0 as numerator
        StringBuilder ans = new StringBuilder();

        // Check if the result is negative
        if ((num < 0) ^ (den < 0)) {
            ans.append("-"); // Append negative sign if only one of them is negative
        }

        // Work with absolute values
        long n = Math.abs((long) num);
        long d = Math.abs((long) den);

        // Integer part of the division
        ans.append(n / d);
        long remainder = n % d;

        // If no remainder, we are done
        if (remainder == 0) {
            return ans.toString();
        }

        // Otherwise, we have a fractional part
        ans.append(".");

        // Map to track the position of each remainder
        Map<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {
            // If the remainder is repeated, we found a repeating fraction
            if (map.containsKey(remainder)) {
                ans.insert(map.get(remainder), "("); // Insert '(' at first occurrence
                ans.append(")"); // Insert ')' at the end of the repeating part
                break;
            }

            // Store the position of the current remainder
            map.put(remainder, ans.length());

            // Multiply remainder by 10 to get the next digit
            remainder *= 10;
            ans.append(remainder / d); // Append the next digit
            remainder = remainder % d; // Update remainder
        }

        return ans.toString();
    }
}
