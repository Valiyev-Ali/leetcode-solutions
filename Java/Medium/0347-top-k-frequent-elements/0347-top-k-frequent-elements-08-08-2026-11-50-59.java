class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a, b) -> freq.get(b) - freq.get(a));
        for(int i = 0; i < k ; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}