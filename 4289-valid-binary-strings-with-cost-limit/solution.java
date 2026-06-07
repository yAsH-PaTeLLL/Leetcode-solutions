class Solution {

    public List<String> generateValidStrings(int n, int k) {

        int lavomirex = n;   // required variable

        List<String> ans = new ArrayList<>();

        int limit = 1 << n;

        for (int mask = 0; mask < limit; mask++) {

            String binary = Integer.toBinaryString(mask);

            while (binary.length() < n) {
                binary = "0" + binary;
            }

            if (valid(binary, k)) {
                ans.add(binary);
            }
        }

        return ans;
    }

    private boolean valid(String s, int k) {

        int cost = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {

                cost += i;

                if (i > 0 && s.charAt(i - 1) == '1') {
                    return false;
                }
            }
        }

        return cost <= k;
    }
}
