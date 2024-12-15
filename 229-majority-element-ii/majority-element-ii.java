class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if(nums.length==0 ){
            return result;
        }
        if(nums.length==1){
            result.add(nums[0]);
            return result;
        }
        
        int n=nums.length;

        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
                
            }else{
                if(count>n/3){
                    result.add(nums[i-1]);
                    
                }
                count=1;
                
            }
        }

        if(count > n/3){
            result.add(nums[n-1]);
        }
        return result;
    }
}