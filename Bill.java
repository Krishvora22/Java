import java.util.*;

public class Bill {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int pen=sc.nextInt();
        int pencil=sc.nextInt();
        int eraser = sc.nextInt();

        int sum = pen + pencil + eraser;
        System.out.println(sum);
          
        float b =sum*0.18f;
        float GST = b+sum;
        System.out.println(GST);
    }
}
