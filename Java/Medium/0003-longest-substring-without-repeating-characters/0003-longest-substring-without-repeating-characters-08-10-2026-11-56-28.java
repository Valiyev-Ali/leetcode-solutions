class Solution {
    public int lengthOfLongestSubstring(String s) {
        int beg = 0, maxLen = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= beg) {
                beg = lastSeen.get(c) + 1;   // where should beg jump to?
            }
            lastSeen.put(c, i);
            maxLen = Math.max(maxLen, (i - beg) + 1);  // window size right now, using i and beg
        }

        return maxLen;
    }
}