class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] hash = new int[255];
        Arrays.fill(hash, -1);

        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {

            if (hash[s.charAt(right)] >= left) {
                left = hash[s.charAt(right)] + 1;
            }

            int len = right - left + 1;
            max = Math.max(max, len);

            hash[s.charAt(right)] = right;
            right++;
        }

        return max;
    }
}