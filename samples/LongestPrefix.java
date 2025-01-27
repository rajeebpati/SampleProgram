package samples;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // If the input array is null or empty, return an empty string.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize prefix with the first string in the array.
        String prefix = strs[0];

        // Iterate through the other strings in the array.
        for (int i = 1; i < strs.length; i++) {
            // Keep checking if the current string starts with the prefix.
            // If not, shorten the prefix by one character from the end.
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty, there is no common prefix, return "".
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }


        // Return the found common prefix.
        return prefix;
    }

    public static void main(String[] args) {
        String [] strs = new String[] {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println("Longest Prefix is: " + prefix);

    }
}
