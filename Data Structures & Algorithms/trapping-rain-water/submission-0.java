class Solution {
    public int trap(int[] height) {
        int left = 0;
        int n = height.length -1;
        int right = n;

        int[] premax = new int[n+1];
        int premaxele = 0;
        
        int[] sufmax = new int[n+1];
        int sufmaxele = 0;

        int ithquantity = 0;
        int totquantity = 0;

        while (left <= n){
            premaxele = Math.max(premaxele,height[left]);
            premax[left] = premaxele;
            left++;
        }

        while (right >= 0){
            sufmaxele = Math.max(sufmaxele,height[right]);
            sufmax[right] = sufmaxele;
            right--;
        }

        for (int i = 0;i <= n;i++ ){
            ithquantity = Math.min(premax[i],sufmax[i]) - height[i];
            totquantity = totquantity + ithquantity;
        }
        return totquantity;
        
    }
}
