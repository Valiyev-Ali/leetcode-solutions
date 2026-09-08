class KthLargest {

    PriorityQueue<Integer> stream = new PriorityQueue<>();
    public int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            stream.offer(nums[i]);
        }
    }
    
    public int add(int val) {
        stream.offer(val);
        while (stream.size() > k) {
            stream.poll();
        }
        return stream.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */