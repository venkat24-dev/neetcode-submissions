class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int ans = 0;
        while (left < right){
            top = Math.min(heights[left],heights[right]);
            ans = Math.max(ans, top * (right - left));
                if (heights[left] < heights[right]){
                    left ++;
                }else {
                    right --;
                }
        }
        return ans;
    }
}



