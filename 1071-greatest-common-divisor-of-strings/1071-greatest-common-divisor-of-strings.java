class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String str3;
        int a = str1.length();
        int b = str2.length();
        int temp;
        
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        str3 = str2.substring(0, a);

        if ((str1 + str2).equals(str2 + str1) && (str2 + str3).equals(str3 + str2)) {
            return str3;
        }
        return "";

    }
}