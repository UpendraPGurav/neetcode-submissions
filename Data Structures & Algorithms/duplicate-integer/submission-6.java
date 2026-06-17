class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            if (hm.containsKey(i)) {
                return true;
            }
            hm.put(i, hm.getOrDefault(i, 1));
        }
        return false;
    }
}