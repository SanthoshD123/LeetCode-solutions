if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        // Compare the sorted char arrays
        return Arrays.equals(charArrayS, charArrayT);
