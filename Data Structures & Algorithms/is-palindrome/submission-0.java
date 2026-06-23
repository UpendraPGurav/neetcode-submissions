class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char curr_char = s.charAt(start);
            char end_char = s.charAt(end);

            // Skip non-alphanumeric characters from left
            if (!Character.isLetterOrDigit(curr_char)) {
                start++;
            }
            // Skip non-alphanumeric characters from right
            else if (!Character.isLetterOrDigit(end_char)) {
                end--;
            }
            // Both are valid, so compare them case-insensitively
            else {
                if (Character.toLowerCase(curr_char) != Character.toLowerCase(end_char)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}