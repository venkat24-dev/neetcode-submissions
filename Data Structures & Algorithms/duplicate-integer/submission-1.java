class Solution {
    public boolean hasDuplicate(int[] nums) {
        LinkedList<Integer> list = new LinkedList<Integer>();
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