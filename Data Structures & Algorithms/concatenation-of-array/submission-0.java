class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] twon=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            twon[i]=nums[i];
            twon[nums.length+i]=nums[i];
        }
        return twon;
    }
}