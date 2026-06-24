class RemoveOccurrences {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceAll(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        RemoveOccurrences ro = new RemoveOccurrences();
        String s = "daabcbaabcbc";
        String part = "abc";
        String result = ro.removeOccurrences(s, part);
        System.out.println(result); // Output: "dab"
    }
}