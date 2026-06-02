class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num).trim().replaceAll("\\s+", " ");
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        }
        if (num < 20) {
            return below20[num];
        } else if (num < 100) {
            return below100[num / 10] + " " + helper(num % 10);
        } else if (num < 1000) {
            return helper(num / 100) + " Hundred " + helper(num % 100);
        } else if (num < 1_000_000) {
            return helper(num / 1000) + " Thousand " + helper(num % 1000);
        } else if (num < 1_000_000_000) {
            return helper(num / 1_000_000) + " Million " + helper(num % 1_000_000);
        } else {
            return helper(num / 1_000_000_000) + " Billion " + helper(num % 1_000_000_000);
        }
    }

    private final String[] below20 = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private final String[] below100 = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
}