class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        helper(candidates , target , list , comb , 0);
        return list;
    }

    private static void helper(int[] candidates , int target , List<List<Integer>> list , List<Integer> comb , int index){
        if(target==0){
            list.add(new ArrayList<>(comb));
            return;
        }

        if(target<0){
            return;
        }

        for(int i = index ; i < candidates.length ; i++){
            comb.add(candidates[i]);
            helper(candidates , target - candidates[i] , list , comb , i);
            comb.remove(comb.size()-1);
        }
    }
}