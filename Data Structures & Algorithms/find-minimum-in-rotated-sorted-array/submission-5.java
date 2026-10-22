class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length - 1;
        if (nums[low] < nums[high]) return nums[0];
        if (high == 0) return nums[0];
        if (nums[high] < nums[high - 1] )return nums[high];
        if (nums[low + 1] < nums[low]) return nums[low + 1];
        while(low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid-1] > nums[mid] && nums[mid] < nums[mid+1]){
                return nums[mid];
            }
            else if (nums[high] < nums[mid]){
                low = mid + 1;
            }else if (nums[high] > nums[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}
