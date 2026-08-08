class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int max = freq.keySet().iterator().next();;
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                if (e.getValue() > freq.get(max)) {
                    max = e.getKey();
                }
            }
            freq.remove(max);
            result[i] = max;
        }
        return result;
    }
}