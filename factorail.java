public class factorail {
       public static int factorial(int a){
        int f=1;
   
        for(int i=1;i<=a;i++){
            f=f*i;
           }
           return f;
        }
    public static void main(String[] args) {
       int a=1;
        System.err.println(factorial(5));
}
}