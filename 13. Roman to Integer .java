lass Solution {
    public int romanToInt(String s) {
        // Create a hashmap to map Roman numerals to their values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int total = 0;
        int prevValue = 0;
        
        // Loop through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValues.get(s.charAt(i));
            if (value >= prevValue) {
                total += value;
            } else {
                total -= value;
            }
            prevValue = value;
        }
        
        return total;
    }
}
