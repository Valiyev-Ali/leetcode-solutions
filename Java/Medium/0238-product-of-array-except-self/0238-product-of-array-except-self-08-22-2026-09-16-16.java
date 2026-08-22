class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = nums[0];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }
        product = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = result[i] * product;
            product *= nums[i];
        }

        return result;
        
    }
}