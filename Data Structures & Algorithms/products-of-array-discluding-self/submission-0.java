class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int prod = 1, zero_cnt = 0;
        for(int num : nums){
            if(num != 0){
                prod *= num;
            }
            else{
                zero_cnt++;
            }
        }
        if(zero_cnt > 1){
            return new int[n];
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(zero_cnt > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }
            else{
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
