
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        
        // List to store [number, frequency] pairs
        List<int[]> frequencies = new ArrayList<>();
        
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            // Check if we are at the end or at a boundary between different numbers
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                frequencies.add(new int[]{nums[i], count});
                count = 1; // Reset count for the next number
            } else {
                count++;
            }
        }
        
        // Sort pairs by frequency in descending order
        frequencies.sort((a, b) -> b[1] - a[1]);
        
        // Pick the top k elements
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = frequencies.get(i)[0];
        }
        
        return res;
    }
}