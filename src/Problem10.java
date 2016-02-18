/**
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void main(String[] args) {
        long sum = 0;
        int num = 1;
        while (num < 2000000) {
            num++;
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
