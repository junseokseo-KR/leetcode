class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int num : account) {
                sum+=num;
            }
            max = max < sum ? sum : max;
        }
        return max;
    }
}