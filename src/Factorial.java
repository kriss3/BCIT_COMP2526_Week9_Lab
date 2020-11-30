public class Factorial {

    //based on the math: 4! = 4 × 3 × 2 × 1 = 24
    //so gram the number passed multiply by the result of the same function but pass-in number-1;
    public int doFactorial(int number)
    {
        int base = 1;
        if (number >= base) {
            //as above: multiply passed in number by the result of the same function but pass-in number less 1;
            return number * doFactorial(number - 1);
        } else {
            return base;
        }
    }
}
