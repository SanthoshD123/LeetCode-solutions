public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort the greed factors in ascending order
        Arrays.sort(s); // Sort the cookie sizes in ascending order

        int contentChildren = 0; // Initialize the count of content children
        int childIndex = 0; // Initialize an index for the children
        int cookieIndex = 0; // Initialize an index for the cookies

        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) {
                // If the current cookie can satisfy the current child's greed factor
                contentChildren++;
                childIndex++;
            }
            cookieIndex++; // Move to the next cookie
        }

        return contentChildren;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        int result1 = solution.findContentChildren(g1, s1);
        System.out.println(result1); // Output: 1

        // Example 2
        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        int result2 = solution.findContentChildren(g2, s2);
        System.out.println(result2); // Output: 2
    }
}
