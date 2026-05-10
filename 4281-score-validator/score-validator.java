class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0, counter = 0;
        for (String s : events) {
            if (s.equals("W")) {
                counter++;
                if (counter == 10)
                    break;
            } else if (s.equals("WD") || s.equals("NB")) {
                score++;
            }else{
                score+=Integer.parseInt(s);
            }
        }
        return new int[] { score, counter };
    }
}