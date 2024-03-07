import java.util.Scanner;

public class Hackerrank2 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            String s1;
            for(int i=0;i<3;i++){
                 s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d", s1 ,x);
                System.out.println();
            }
            
            
            
            System.out.println("================================");

    }
}
