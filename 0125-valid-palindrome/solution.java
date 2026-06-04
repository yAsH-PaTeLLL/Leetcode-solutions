class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder ss = new StringBuilder();

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9')) {
                ss.append(ch);
            }
        }

        String original = ss.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
