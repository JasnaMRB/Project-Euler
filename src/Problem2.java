public class Problem2 {

    /**
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     * @param args the solution
     */
    public static void main(String[] args) {
        int start = 2;
        int previous = 1;
        int sum = 0;
        while (start < 4000000) {
            if (start % 2 == 0) sum += start;
            int tempPrev = previous;
            previous = start;
            start = start + tempPrev;
        }
        System.out.println("Total: " + sum);
    }
}
