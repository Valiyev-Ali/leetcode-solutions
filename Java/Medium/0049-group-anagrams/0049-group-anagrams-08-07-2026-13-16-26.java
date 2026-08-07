class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] currKey = new int[26];
            for(int j = 0; j < strs[i].length(); j++) {
                char letter = strs[i].charAt(j);
                currKey[letter - 'a']++;
            }
            String key = Arrays.toString(currKey);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(strs[i]);
        }
        return new ArrayList<>(groups.values());
    }
}
