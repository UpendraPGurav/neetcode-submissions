class Solution {
    public boolean hasDuplicate(int[] nums) {
    
        HashSet<Integer> mp = new HashSet<>();
        // for (int i = 0; i < nums.length ; i++) {
        //    if(mp.containsKey(nums[i])){
        //     return true;
        //    }else{
        //     mp.put(nums[i],1);
        //    }
        // }
        // return false;
        for(int num:nums){
            if(mp.contains(num)){
                return true;
            }else{
                mp.add(num);
            }
        }
        return false;
        
    }
}