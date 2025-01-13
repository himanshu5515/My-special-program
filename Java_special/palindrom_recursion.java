public class palindrom_recursion {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindromeRecursive(str,0,str.length()-1));
    }
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        // Base case: If left index is greater than or equal to right index, it's a palindrome
        if (left >= right) {
            return true;
        }

        // Check if characters at left and right indices are the same
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call with the next inner substring
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}
