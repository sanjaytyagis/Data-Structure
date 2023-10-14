package Maths;
import java.util.*;

// find the prime number between 2 and n
public class SieveOfEratosthenes {

	public static List<Integer> sieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        
        List<Integer> primes = new ArrayList<>();

        // Initialize the isPrime array to true
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) { // retrieve all the numbers till limit
            if (isPrime[p]) {
                // Mark all multiples of p as composite
                for (int i = p * p; i <= limit; i += p) // Marking Composite Numbers false
                    isPrime[i] = false;  
            }
        }

        // Collect the prime numbers into the 'primes' list
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
	public static void main(String[] args) {
		int limit = 10; // Set your desired limit here
        List<Integer> primeNumbers = sieve(limit);

        System.out.println("Prime numbers up to " + limit + " are: ");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
	}
}
