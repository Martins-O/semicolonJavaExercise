package practice;

public class Varargs {
    public static double arguments(double... numbers) {//ellipsis of an array.
        double total = 0;

        for (double g : numbers) {
            total += g;
            System.out.println("i'm here");
        }
        return total * numbers.length;
    }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2= 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n", d1,d2,d3,d4);

        System.out.printf("Average of d1 and d2 is %.1f%n", arguments(d1,d4) / d3);
    }
}