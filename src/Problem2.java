public class Problem2 {

    public static void main(String[] args) {

/*
        Each new term in the Fibonacci sequence is generated by adding the previous two terms.
        By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

        By considering the terms in the Fibonacci sequence whose values do not exceed four million,
        find the sum of the even-valued terms.
*/

        Integer tempVar, term = 1, lastTerm = 1, sum = 0;

        while(term < 4000000) {
            if(term % 2 == 0)
                sum += term;
            tempVar = term;
            term = tempVar + lastTerm;
            lastTerm = tempVar;
        }

        System.out.println(sum);
    }
}
