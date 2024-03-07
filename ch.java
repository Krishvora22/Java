
import java.util.*;

public class ch {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        char ch = 'A';

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.err.println();

        }
    }
}