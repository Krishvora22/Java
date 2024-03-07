import java.util.*;
public class incometax{
     public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int income=sc.nextInt();

        if(income<500000){
           System.out.println("0 % tax");
           System.out.println(income);
        }

        else if(income>=5000 && income<=100000)
        {
            float paisa = income*0.2f +income ;

            System.out.println(paisa);

        }

        else{
            float paisa = income*0.3f+income;

            System.out.println(paisa);
        }
     }
}