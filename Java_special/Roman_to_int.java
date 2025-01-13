public class Roman_to_int {

      public static void main(String[] args) {
            char row[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
            int num[] = {1000, 500, 100, 50, 10, 5, 1};
            String str = "LVIII";
            System.out.println(roman_to_int(row, num, str));
        }

        public static int roman_to_int(char row[], int num[], String str) {
            int ans = 0;
            int prevValue = 0; // To keep track of the previous value for subtraction logic

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                int currentValue = 0;

                // Find the integer value corresponding to the Roman numeral
                for (int j = 0; j < row.length; j++) {
                    if (currentChar == row[j]) {
                        currentValue = num[j];
                        break;
                    }
                }

                // If the current value is greater than the previous value, subtract twice the previous value
                if (currentValue > prevValue) {
                    ans += currentValue - 2 * prevValue;
                } else {
                    ans += currentValue;
                }

                prevValue = currentValue;
            }

            return ans;
        }
    }

