import java.util.ArrayList;

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    static boolean isPalindrome(long number) {
        String[]array = Long.toString(number).split("");
        int end = array.length-1;
        for (int start = 0; start < array.length; start++) {
            if (!array[start].equals(array[end])) return false;
            end -= 1;
        }
        return true;
    }
    public static void main(String args[]) {
        int a = 999;
        int largest = 0;
        long startTime = System.nanoTime();
           while (a >= 100) {
                int b = 999;
                while (b >= a) {
                    if (a*b <= largest) break;
                    if (isPalindrome(a*b)) largest = a*b;
                    b -= 1;
                }
                a -= 1;
            }
        System.out.println(largest);
        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime)/1000000 + " ms");
    }
}
