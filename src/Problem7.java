/**
 * What is the 10 001st prime number?
 */
public class Problem7 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        while (count < 10001) {
            num++;
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) count++;
        }
        System.out.println(num);
    }
}
