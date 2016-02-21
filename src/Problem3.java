import java.util.ArrayList;
import java.util.List;

/**
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static void main(String args[]) {
        double num = 600851475143.0;
        List<Double> factors = new ArrayList<>();
        for (double i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        List<Double> primeFactors = new ArrayList<>();
        factors.forEach(factor -> {
            boolean prime = true;
            for (double i = 3; i <= Math.sqrt(factor);i++) {
                if (factor % i == 0) {
                   prime = false;
                }
            }
            if (prime)
                if (!primeFactors.contains(factor))
                    primeFactors.add(factor);
        });
        double largest = primeFactors.get(0);
        for (int i = 0; i < primeFactors.size(); i++) {
            if (primeFactors.get(i) > largest) largest = primeFactors.get(i);
        }

        System.out.println(largest);
    }
}
