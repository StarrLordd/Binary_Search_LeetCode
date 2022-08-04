class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=0;
        int left=0,right=nums.length-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target)right=mid-1;
            if(nums[mid]<target) left=mid+1;
        }
        return left;
    }
}