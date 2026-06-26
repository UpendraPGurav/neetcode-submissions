class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxlength = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        while (right < s.length()) {
            char currChar = s.charAt(right);

            if (hm.containsKey(currChar)) {
                int lastIndex = hm.get(currChar);
                int newLeft = lastIndex + 1;

                if (newLeft > left) {
                    left = newLeft;
                }
            }

            hm.put(currChar, right);

            int currWindowSize = right - left + 1;

            maxlength = Math.max(maxlength, currWindowSize);
            right++;
        }
        return maxlength;
    }
}
