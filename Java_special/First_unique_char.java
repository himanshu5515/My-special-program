public class First_unique_char {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstunique(str));

    }

    public  static  int firstunique(String str) {
        int result = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int idx = str.indexOf(c);
            System.out.println(str.lastIndexOf(c));
            if (idx != -1 && idx == str.lastIndexOf(c)) {
                result = Math.min(result, idx);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }/// leetcode 387
}
