class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drank = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newFull = 0;
            while (empty >= numExchange) {
                empty-=numExchange;
                newFull+=1;
                numExchange++;
            }
            drank += newFull;
            empty = empty % numExchange + newFull;
        }
        return drank;
    }
}