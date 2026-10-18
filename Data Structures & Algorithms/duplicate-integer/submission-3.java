class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
        for (int num : nums){
            if (list.containsKey(num)){
                return true;
            }else {
                list.put(num,1);
            }
        }
        return false;
    }
}