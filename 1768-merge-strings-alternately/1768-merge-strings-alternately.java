class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        String result = "";
        while ((index1 < word1.length()) && (index2 < word2.length())) {
            result += word1.charAt(index1);
            result += word2.charAt(index2);
            index1++;
            index2++;
        }
        if (!(index1 == word1.length() && index2 == word2.length())) {
            if (index1 == word1.length() && index2 != word2.length()) {
                result += word2.substring(index2);
            }
            else {
                result += word1.substring(index1);
            }
        }
        return result;
    }
}