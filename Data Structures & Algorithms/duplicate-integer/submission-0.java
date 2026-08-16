class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        int i = 0;
        if (nums.length == 0) return false;

        while(i<nums.length){
            if(hs.contains(nums[i])){
                return true;
            }
            else hs.add(nums[i]);
            i++;
        }

        return false;
    }
}