class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sToTMapping = new char[256]; // Assuming ASCII characters
        char[] tToSMapping = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (sToTMapping[charS] != 0 && sToTMapping[charS] != charT) {
                return false; // Violates isomorphism
            } else {
                sToTMapping[charS] = charT;
            }

            if (tToSMapping[charT] != 0 && tToSMapping[charT] != charS) {
                return false; // Violates isomorphism
            } else {
                tToSMapping[charT] = charS;
            }
        }

        return true;
    }
}
