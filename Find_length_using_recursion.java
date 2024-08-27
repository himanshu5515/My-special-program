public class Find_length_using_recursion {

    public static int findLength(String str) {
            // Base case: if the string is empty, its length is 0
            if (str.equals("")) {
                return 0;
            } else {
                // Recursive case: remove the first character from the string and recursively find the length of the remaining string
                return 1 + findLength(str.substring(1));
            }

        }
        public static void main(String[] args) {
            String testString = "himanshu";
            int length = findLength(testString);
            System.out.println("Length of the string \"" + testString + "\" is: " + length);
        }
    }


