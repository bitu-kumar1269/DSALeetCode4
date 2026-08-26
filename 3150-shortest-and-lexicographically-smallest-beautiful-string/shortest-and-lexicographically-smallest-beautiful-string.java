class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int left = 0, count = 0;
        String ans = "";

        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                count++;
            }

            // Shrink window from the left if we have k ones
            while (count == k) {
                // Remove leading zeros to get the shortest substring starting with '1'
                if (s.charAt(left) == '1') {
                    String sub = s.substring(left, right + 1);

                    // Update answer if it's the first match, shorter, or lexicographically smaller
                    if (ans.isEmpty() || sub.length() < ans.length() || 
                       (sub.length() == ans.length() && sub.compareTo(ans) < 0)) {
                        ans = sub;
                    }

                    // Move left forward and decrement count to search for the next window
                    count--;
                }
                left++;
            }
        }

        return ans;
    }
}