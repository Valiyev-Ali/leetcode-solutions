class KthLargest {

    public int kth;
    public ArrayList<Integer> stream = new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        kth = k;
        for (int i = 0; i < nums.length; i++) {
            stream.add(nums[i]);
        }
    }
    
    public int add(int val) {
        stream.add(val);
        stream.sort(null);
        return stream.get(stream.size() - kth);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */