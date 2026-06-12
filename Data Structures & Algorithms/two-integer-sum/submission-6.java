class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int diff = target - nums[i];

            if(mpp.containsKey(diff)){
                return new int[]{Math.min(i, mpp.get(diff)), Math.max(i, mpp.get(diff))};
            }
            mpp.put(nums[i], i);
        }
        return new int[]{};
    }
}
