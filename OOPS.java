public class OOPS {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolour("blue");
 System.out.println(p1.color);
    }
    }

    class pen{
        String color;
        int tip;
        int price;

        void setcolour(String newcolor){
            color = newcolor;
        }
        void settrip(int newtip){
            tip=newtip;
        }
    }

