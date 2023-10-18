class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n1 = 2;
        int n2 = 5;
        int[] output1 = solution.countBits(n1);  // Output: [0, 1, 1]
        int[] output2 = solution.countBits(n2);  // Output: [0, 1, 1, 2, 1, 2]

        for (int num : output1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : output2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
