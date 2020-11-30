/**
 * Recursion functions;
 * @author : Krzysztof Szczurowski, Id: A01013054.
 * @version : 2020.
 */
public class Driver {
    public static void main(String[] args) {

        System.out.println();
        RunPalindrome();

        System.out.println("==========================");
        System.out.println();
        RunFibonacci();
        System.out.println();
        System.out.println("==========================");
        System.out.println();
        RunFactorial();
    }

    private static void RunPalindrome() {
        String stringExample = "Dot saw I was Tod";
        var p = new Palindrome();
        String not = "";
        var result = p.isPalindrome(stringExample);
        if (!result) {
            not = "not";
        }
        System.out.println("The word/sentence: " + stringExample + " is " + not + " a palindrome.");
    }

    private static void RunFibonacci() {
        Fibonacci f = new Fibonacci();
        var number = 4;
        System.out.println("The sum of numbers in fibonacci series of number: "
                + number + " is equal to: " + f.doFibonacci(number));
    }

    private static void RunFactorial() {
        Factorial f = new Factorial();
        int testFactorialNumber = 10;
        var result = f.doFactorial(testFactorialNumber); //run recursion function for testFactorial number
        System.out.println("The Factorial of " + testFactorialNumber + " is equal to " + result);
    }
}
