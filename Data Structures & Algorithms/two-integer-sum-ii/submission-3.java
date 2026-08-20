class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            
            // Check if complement already exists BEFORE putting current element
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment)+1, i+1 };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[0];
    }
}