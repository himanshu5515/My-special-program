public class counting_sort {
        public static void main(String[] args) {
            int[] arr = {4, 2, 2, 8, 3, 3, 1};

            System.out.println("Before Sorting:");
            printArray(arr);

            countingSort(arr);

            System.out.println("\nAfter Sorting:");
            printArray(arr);
        }

        // Method to perform counting sort
        public static void countingSort(int[] array) {
            // Step 1: Find the maximum value in the array
            int max = findMax(array);

            // Step 2: Create a count array to store the frequency of each number
            int[] count = new int[max + 1];

            // Step 3: Count the occurrences of each number
            for (int i = 0; i < array.length; i++) {
               // System.out.println(">"+count[array[i]]++);
                count[array[i]]++;

            }
            System.out.println("count arr value");
            for(int i=0; i<count.length; i++){
                System.out.print(count[i]+",");
            }




            // Step 4: Reconstruct the sorted array using the count array
            int index = 0;
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    array[index++] = i;
                    count[i]--;
                }
            }
        }

        // Utility method to find the maximum value in the array
        public static int findMax(int[] array) {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        // Utility method to print the array
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


