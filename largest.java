import java.util.*;

public class largest {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b) {
            if (b < c) {
                System.out.print(c);
            } else {
                System.out.print(b);
            }
        } else if (a > b) {
            if (a < c) {
                System.out.print(c);

            } else {
                System.out.print(a);

            }
        }

    }
}
