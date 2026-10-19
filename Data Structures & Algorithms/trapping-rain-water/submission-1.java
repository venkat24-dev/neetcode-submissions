class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int left = 0;
        int right = n - 1;
        ArrayList<Integer> pretops = new ArrayList<>();
        int pretop = 0;
        ArrayList<Integer> suftops = new ArrayList<>();
        int suftop = 0;
        while (left < n){
            pretop = Math.max(pretop,height[left]);
            pretops.add(pretop);
            left ++;
        }
        while (right >= 0){
            suftop = Math.max(suftop,height[right]);
            suftops.add(suftop);
            right --;
        }

        int ithquantity = 0;
        int totquantity = 0;

        for (int i = 0; i < n ;i ++){
            int precomp = pretops.get(i);
            int sufcomp = suftops.get(n - 1 - i);
            ithquantity = Math.min(precomp,sufcomp) - height[i];
            totquantity += ithquantity;
        }
        return totquantity;
    }
}
