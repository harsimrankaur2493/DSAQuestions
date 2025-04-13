/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    //finding peak element using binary search
    public int findPeak(MountainArray mountainArr){
        int start=0;
        int end = mountainArr.length()-1;
        int mid=-1;
        while(start <=end){
            mid = start + (end - start )/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                //we arev in the desc part of the array so look left;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        
        int peakIndex = findPeak(mountainArr);
        if(target==mountainArr.get(peakIndex)){
            return peakIndex;
        }
        int startAsc = 0;
        int endAsc = peakIndex-1;
        int midAsc=0;

        int startDsc = peakIndex+1;
        int endDsc = mountainArr.length()-1;

        while(startAsc <= endAsc){
            midAsc = startAsc + (endAsc - startAsc)/2;
            if(mountainArr.get(midAsc) < target){
                startAsc=midAsc+1;
            }
            else if(mountainArr.get(midAsc) > target){
                endAsc = midAsc-1;
            }
            else if(mountainArr.get(midAsc) == target){
                return midAsc;
            }
        }
        int midDsc =0;

        while(startDsc <= endDsc){
            midDsc = startDsc + (endDsc - startDsc)/2;
            if(mountainArr.get(midDsc) > target){
                startDsc=midDsc+1;
            }
            else if(mountainArr.get(midDsc) < target){
                endDsc = midDsc-1;
            }
            else if(mountainArr.get(midDsc) == target){
                return midDsc;
            }
        }
        return -1;


        
    }
}