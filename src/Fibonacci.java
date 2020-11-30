public class Fibonacci {

    public int doFibonacci (int i) {
        if (i == 0) {
            return 0;
        }

        if (i <= 2) {
            return 1;
        }
        //Fibonacci Sequence:
        //i.e. 0, 1, 1, 2, 3, 5, 8, 13, 21 (btw. often used in SCRUM)
        //any number greater than 1 is the sum of the previous two number
        int result = doFibonacci(i - 1) + doFibonacci(i - 2);
        return result;
    }
}
