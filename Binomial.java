public class Binomial {

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int c(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int c=fact_n/(fact_r*fact_nmr);
        return c;
    }

    public static void main(String[] args) {
        System.err.println(c(5,1));

    }
}
