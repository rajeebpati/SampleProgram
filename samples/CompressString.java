package samples;

public class CompressString {
    // Implement a method that compress a string by replacing sequences of the same character with the character followed by the count of occurance

    public static void main(String[] args) {
       // String str = "aabbcccaaabb";
        String str = "abbcd";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                sb.append(str.charAt(i-1)).append(count);
                count =1;
            }
        }

        if(str.length() > 0) {
            sb.append(str.charAt(str.length()-1)).append(count);
        }

        String result = sb.length()<str.length() ? sb.toString() : str;
        System.out.println(result);
    }
}
