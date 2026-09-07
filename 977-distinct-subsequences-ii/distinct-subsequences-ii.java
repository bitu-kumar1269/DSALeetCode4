class Solution {
    public int distinctSubseqII(String str) {
        int n = str.length();
        int mod = 1000000007;

        // to store the last occurrence 
        // of each character in the string
        int[] last = new int[26];

        // to store result after each index
        int res = 1;

        for (int i = 1; i <= n; i++) {

            // double the count of unique subsequences
            // and remove the repetition
            int cur = (int)(((2L * res) % mod - 
                    last[str.charAt(i - 1) - 'a'] + mod) % mod);

            // update the last occurrence of the character
            last[str.charAt(i - 1) - 'a'] = res;
            res = cur;
        }
        return (res - 1 + mod) % mod;
    }
}