import java.util.Scanner;

public class Substring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String test="";
        
        smallest=largest;
        for(int i=0;i<=s.length()-k;i++){
            test=s.substring(i,i+k);
            if(smallest.compareTo(test)>0){
                smallest=test;
            }
        }
        
                for(int i=0;i<=s.length()-k;i++){
            test=s.substring(i,i+k);
            if(largest.compareTo(test)<0){
                largest=test;
            }
                }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

