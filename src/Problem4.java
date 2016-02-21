import java.time.Duration;
import java.time.Instant;

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
        Instant start = Instant.now();
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
        Instant end = Instant.now();
        System.out.println("Duration: " + Duration.between(start,end));
    }
}
