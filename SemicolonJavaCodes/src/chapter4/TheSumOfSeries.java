package chapter4;
//(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
//        n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
//        corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
//        with the variable that accumulates the product?
public class TheSumOfSeries {
    public static void main(String[] args) {
        long total = 0;
        for (long i = 1; i <= 100; i++){
            total = i + i;
            System.out.println(i + "\t \t" +total);
        }
        System.out.println();
    }
}
