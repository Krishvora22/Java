public class str {
public static void main(String arg[]) {
   String name = "NNNE";
   int x = 0;
   int y = 0;
   for (int i = 0; i < name.length(); i++) {

      char PATH = name.charAt(i);

      if (PATH == 'N') {
         y++;
      } else if (PATH == 'W') {
         x--;
      } else if (PATH == 'S') {
         y--;
      } else {
         x++;
      }
   }
   int x2 = x * x;
   int y2 = y * y;

   double a = Math.sqrt(x2 + y2);
   System.out.println(a);
}
}