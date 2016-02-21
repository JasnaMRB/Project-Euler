import java.util.ArrayList;
import java.util.List;

/**
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    private static List<String> getParts(String string, int partitionSize) {
        List<String> parts = new ArrayList<>();
        int len = string.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            parts.add(string.substring(i, Math.min(len, i + partitionSize)));
        }
        return parts;
    }
    public static void main(String args[]) {
        double num = 600851475143.0;
        List<Double> factors = new ArrayList<>();
        for (double i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        System.out.println(factors);
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
        System.out.println(primeFactors);
        double largest = primeFactors.get(0);
        for (int i = 0; i < primeFactors.size(); i++) {
            if (primeFactors.get(i) > largest) largest = primeFactors.get(i);
        }

        System.out.println(largest);
    }
}
