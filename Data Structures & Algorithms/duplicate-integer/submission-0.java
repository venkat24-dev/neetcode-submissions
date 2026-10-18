class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums){
            if (list.contains(num)){
                return true;
            }else {
                list.add(num);
            }
        }
        return false;
    }
}