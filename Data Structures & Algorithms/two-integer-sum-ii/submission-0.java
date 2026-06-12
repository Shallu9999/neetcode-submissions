class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;

        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int diff = target - numbers[i];

            if(mpp.containsKey(diff)){
                return new int[]{Math.min(i + 1, mpp.get(diff) + 1), Math.max(i + 1, mpp.get(diff) + 1)};
            }
            mpp.put(numbers[i], i);
        }
      
        return new int[]{};
    }
}
