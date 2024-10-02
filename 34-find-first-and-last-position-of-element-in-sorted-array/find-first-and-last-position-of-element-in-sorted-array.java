class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arrReturn[]= new int[2];
        if(nums.length==0){
            arrReturn[0] = -1;
            arrReturn[1] = -1;
            return arrReturn;
        }
        int index1 =0;
        boolean flag1 = false;
        int index2 = nums.length-1;
        while(index1<nums.length){
            if(nums[index1] == target){
                flag1 = true;
                break;
                
            }
            index1++;
            
        }
        boolean flag2 = false;
        while(index2>=0){
            if(nums[index2] == target){
                flag2 = true;
                break;
                
            }
            index2--;
        }
        
        if(flag1 && flag2){
            arrReturn[0] = index1;
            arrReturn[1] = index2;
        }else{
            arrReturn[0] = -1;
            arrReturn[1] = -1;

        }
        return arrReturn;
        
    }
}