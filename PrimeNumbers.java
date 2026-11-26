public class PrimeNumbers {

    // Returns true if n is a prime number
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers between 0 and 500:");
        for (int number = 0; number <= 500; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total prime numbers found: " + count);
    }
}