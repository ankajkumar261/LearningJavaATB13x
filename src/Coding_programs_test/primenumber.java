package Coding_programs_test;

public class primenumber {
        public static void main(String[] args) {
            System.out.println("Prime numbers from 1 to 100 are:");

            // Loop from 1 to 100
            for (int number = 1; number <= 100; number++) {
                int count = 0;

                // Count how many numbers divide 'number' exactly
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }

                // A prime number has exactly 2 divisors: 1 and itself
                if (count == 2) {
                    System.out.print(number + " ");
                }
            }
        }
    }
