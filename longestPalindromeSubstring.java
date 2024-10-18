public class Palindrome {

    static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static String findLongestPalindrome(String str) {
        int n = str.length();
        int maxLength = 1, startIdx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(str, i, j) && (j - i + 1) > maxLength) {
                    startIdx = i;
                    maxLength = j - i + 1;
                }
            }
        }

        return str.substring(startIdx, startIdx + maxLength);
    }

    public static void main(String[] args) {
        String str = "bananas";
        System.out.println(findLongestPalindrome(str));
    }
}
