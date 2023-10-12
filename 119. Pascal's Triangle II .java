
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        if (rowIndex < 0) {
            return result;
        }

        result.add(1); // The first element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // The first element is always 1

            for (int j = 1; j < i; j++) {
                row.add(result.get(j - 1) + result.get(j));
            }

            row.add(1); // The last element is always 1

            result = row;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Examples
        System.out.println(solution.getRow(3)); // Output: [1, 3, 3, 1]
        System.out.println(solution.getRow(0)); // Output: [1]
        System.out.println(solution.getRow(1)); // Output: [1, 1]
    }
}
