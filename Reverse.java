import java.util.*;
public class Reverse {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
        int lastdigit=n%10;
        System.out.print(lastdigit);
        n=n/10;
        }
}
}

