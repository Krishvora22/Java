public class array {

    public static void update(int marks[]){
        for(int i=0;i<marks.length; i++){
             marks[i]=marks[i]+2;
        }
    }
    public static void main(String[] args) {
        int marks[]={12, 23,67,74};
        update(marks);

        for(int j=0;j<marks.length;j++){
              System.out.println(marks[j]);
        }
    }
}
