class Solution {
    public int maximumWealth(int[][] accounts) {
        int arr[] = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for( int j=0;j<accounts[i].length;j++){

                arr[i] += accounts[i][j];
            }
        }
        int maxWealth = 0;
        for(int i=0;i<arr.length;i++){
            maxWealth = Math.max(maxWealth, arr[i]);
        }

        return maxWealth;
    }
}