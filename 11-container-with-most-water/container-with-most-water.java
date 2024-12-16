class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxW=0;
        while(i<j){
            int l=Math.min(height[i], height[j]);
            int w=j-i;
            int area=l*w;

            maxW=Math.max(maxW, area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxW;
    }
}