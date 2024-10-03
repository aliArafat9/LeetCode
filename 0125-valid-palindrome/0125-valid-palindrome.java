class Solution {
    public boolean isPalindrome(String s) {
        // Create a new string with only alphanumeric characters and convert it to
        // lowercase
        StringBuilder x = new StringBuilder();

        // Filter out non-alphanumeric characters
        // for (char i : s.toCharArray()) {
        //     if (Character.isLetterOrDigit(i)) {
        //         x.append(Character.toLowerCase(i));
        //     }
        // }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                x.append(Character.toLowerCase(c));
            }
        }

        // Reverse the filtered string
        String y = x.reverse().toString();

        // Reverse the reversed string back to check equality with the original filtered
        // string
        return x.reverse().toString().equals(y);
    }
}
