class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int mid = s.length() / 2;
        int left = 0;
        int right = s.length();
        while (left < right) {
            if (!(s.substring(left, left + 1).equals(s.substring(right - 1, right)))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}