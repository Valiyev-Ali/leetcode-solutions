class Solution {
    public boolean isValid(String s) {
        Deque<Character> opened = new ArrayDeque<>();
        char currType;
        if ((s.length() % 2) == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            currType = s.charAt(i);
            if (currType == '(' || currType == '[' || currType == '{') {
                opened.push(currType);
            }
            else if (!opened.isEmpty() ) {
                if (currType == ')' && opened.peek() != '(') {
                    return false;
                }
                else if (currType == ']' && opened.peek() != '[') {
                    return false;
                }
                else if (currType == '}' && opened.peek() != '{') {
                    return false;
                }
                else {
                    opened.pop();
                }
            }
            else {
                return false;
            }
        }
        if (opened.isEmpty()) {
            return true;
        }
        return false;
    }
}